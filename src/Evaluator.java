import java.lang.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import science.garzon.ExpertSystem.*;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class Evaluator extends ExpertRuleBaseVisitor<ExpertRuleVar> {
    public HashMap<String, ExpertRuleVar> vars = new HashMap<>();
    public HashSet<String> output;
    public HashSet<Integer> visitedIf = new HashSet<>();
    public boolean hasError = false;
    public boolean isUpdated = false;

    public static String trim(String id) {
        return id.substring(1, id.length() - 1);
    }

    public boolean checkAllOutputAssigned() {
        for(String outputVarName: output) {
            if(!vars.containsKey(outputVarName)) return false;
        }
        return true;
    }

    @Override public ExpertRuleVar visitNumDeclare(ExpertRuleParser.NumDeclareContext ctx) {
        String varName = trim(ctx.varName().getText());
        ExpertRuleVar res = vars.get(varName);
        res.readNumInput();
        return null;
    }

    @Override public ExpertRuleVar visitStrDeclare(ExpertRuleParser.StrDeclareContext ctx) {
        String varName = trim(ctx.varName().getText());
        ExpertRuleVar res = vars.get(varName);
        res.readStrInput();
        return null;
    }

    @Override public ExpertRuleVar visitIfStatement(ExpertRuleParser.IfStatementContext ctx) {
        if(visitedIf.contains(ctx.hashCode())) return ExpertRuleVar.makeVoid();
        ExpertRuleVar exp = visit(ctx.exp());
        if(exp.isError() || exp.isVoid()) return exp;
        if((boolean)exp.value) {
            visitedIf.add(ctx.hashCode());
            isUpdated = true;
            for(ExpertRuleParser.AssignExpContext stmt: ctx.assignExp()) {
                ExpertRuleVar res = visit(stmt);
                if(res.isError()) return res;
            }
        }
        return ExpertRuleVar.makeVoid();
    }

    @Override public ExpertRuleVar visitVal(ExpertRuleParser.ValContext ctx) {
        if(ctx.str != null) {
            return ExpertRuleVar.makeString(ctx.str.getText());
        }
        if(ctx.num != null) {
            try {
                return ExpertRuleVar.makeFloat(Float.parseFloat(ctx.num.getText()));
            } catch (NumberFormatException e) {
                hasError = true;
                return CliUtil.err(ctx.num, "invalid number format.");
            }
        }
        assert (false);
        return ExpertRuleVar.makeError();
    }

    private boolean typeNotMatch(ParserRuleContext ctx, ExpertRuleVar got, ExpertRuleVar expected) {
        if(got.type == null) return true;
        assert (expected.type != null);
        if(!got.type.equals(expected.type)) {
            hasError = true;
            CliUtil.err(ctx, String.format("Type not match: Got %s, %s expected", got, expected));
            return true;
        }
        return false;
    }

    @Override public ExpertRuleVar visitAssignExp(ExpertRuleParser.AssignExpContext ctx) {
        ExpertRuleVar res = visit(ctx.val());
        if(res.isError()) return res;
        vars.put(ExpertRuleVar.trim(ctx.varName().getText()), res);
        return ExpertRuleVar.makeVoid();
    }

    @Override public ExpertRuleVar visitOpExp(ExpertRuleParser.OpExpContext ctx) {
        String varName = ExpertRuleVar.trim(ctx.varName().getText());
        ExpertRuleVar res = vars.get(varName);
        if(res == null) return ExpertRuleVar.makeVoid();
        ExpertRuleVar v = visit(ctx.val());
        if(v.isError()) return v;

        if(ctx.op().assignOp() != null) {
            if(typeNotMatch(ctx.varName(), res, v)) return ExpertRuleVar.makeError();
            if(res.type.equals("string")) return ExpertRuleVar.makeBool((res.value).equals(v.value));
            if(res.type.equals("number")) return ExpertRuleVar.makeBool((float)res.value == (float)v.value);
        } else {
            String opSym = ctx.op().getText();
            if(typeNotMatch(ctx.val(), v, ExpertRuleVar.makeFloat(null))) return ExpertRuleVar.makeError();
            if(typeNotMatch(ctx.varName(), res, ExpertRuleVar.makeFloat(null))) return ExpertRuleVar.makeError();
            if(opSym.equals("<")) return ExpertRuleVar.makeBool((float)res.value < (float)v.value);
            if(opSym.equals("<=")) return ExpertRuleVar.makeBool((float)res.value <= (float)v.value);
            if(opSym.equals(">")) return ExpertRuleVar.makeBool((float)res.value > (float)v.value);
            if(opSym.equals(">=")) return ExpertRuleVar.makeBool((float)res.value >= (float)v.value);
        }
        assert (false);
        return ExpertRuleVar.makeError();
    }

    @Override public ExpertRuleVar visitOrExp(ExpertRuleParser.OrExpContext ctx) {
        ExpertRuleVar l = visit(ctx.l);
        if(l.isError() || l.isVoid()) return l;
        ExpertRuleVar r = visit(ctx.r);
        if(r.isError() || r.isVoid()) return r;
        return ExpertRuleVar.makeBool((boolean)l.value || (boolean)r.value);
    }

    @Override public ExpertRuleVar visitAndExp(ExpertRuleParser.AndExpContext ctx) {
        ExpertRuleVar l = visit(ctx.l);
        if(l.isError() || l.isVoid()) return l;
        ExpertRuleVar r = visit(ctx.r);
        if(r.isError() || r.isVoid()) return r;
        return ExpertRuleVar.makeBool((boolean)l.value && (boolean)r.value);
    }
}