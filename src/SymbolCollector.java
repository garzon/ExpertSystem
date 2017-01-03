import java.lang.*;
import java.util.*;

import org.antlr.v4.runtime.tree.TerminalNode;
import science.garzon.ExpertSystem.*;
import org.antlr.v4.runtime.*;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class SymbolCollector extends ExpertRuleBaseVisitor<Object> {
    public HashMap<String, ExpertRuleVar> vars = new HashMap<>();
    public HashSet<String> output = new HashSet<>();
    public boolean hasError = false;

    private boolean isDefined(ParserRuleContext ctx, String varName) {
        if(vars.get(varName) != null) {
            hasError = true;
            CliUtil.err(ctx, String.format("Variable '%s' has been defined previously.", varName));
            return true;
        }
        return false;
    }

    @Override public Object visitNumber(ExpertRuleParser.NumberContext ctx) {
        try {
            float res = Float.parseFloat(ctx.getText());
            return res;
        } catch (NumberFormatException e) {
            hasError = true;
            CliUtil.err(ctx, String.format("Invalid number '%s'.", ctx.getText()));
            return null;
        }
    }

    @Override public Object visitNumDeclare(ExpertRuleParser.NumDeclareContext ctx) {
        String varName = ExpertRuleVar.trim(ctx.varName().getText());
        if(isDefined(ctx, varName)) {
            hasError = true;
            return null;
        }
        ExpertRuleVar res = new ExpertRuleVar();
        res.type = "number";
        res.name = varName;
        if(ctx.left != null) {
            Object n = visit(ctx.left);
            if(n != null)
                res.left = (float) n;
        }
        if(ctx.right != null) {
            Object n = visit(ctx.right);
            if(n != null)
                res.right = (float) n;
        }
        vars.put(varName, res);
        return null;
    }

    @Override public Object visitStrDeclare(ExpertRuleParser.StrDeclareContext ctx) {
        String varName = ExpertRuleVar.trim(ctx.varName().getText());
        if(isDefined(ctx, varName)) {
            hasError = true;
            return null;
        }
        ExpertRuleVar res = new ExpertRuleVar();
        res.type = "string";
        res.name = varName;
        res.values = new HashSet<>();
        for(TerminalNode val: ctx.STRING()) {
            res.values.add(ExpertRuleVar.trim(val.getText()));
        }
        vars.put(varName, res);
        return null;
    }

    private void addInitVar(ParserRuleContext ctx, String varName) {
        if(isDefined(ctx, varName)) {
            hasError = true;
            return;
        }
        ExpertRuleVar res = new ExpertRuleVar();
        res.name = varName;
        vars.put(varName, res);
    }

    /*
    @Override public Object visitVar(ExpertRuleParser.VarContext ctx) {
        for(TerminalNode val: ctx.STRING()) {
            String varName = trim(val.getText());
            addInitVar(ctx, varName);
        }
        return null;
    }
    */

    @Override public Object visitOutput(ExpertRuleParser.OutputContext ctx) {
        for(TerminalNode val: ctx.STRING()) {
            String varName = ExpertRuleVar.trim(val.getText());
            //addInitVar(ctx, varName);
            output.add(varName);
        }
        return null;
    }
}
