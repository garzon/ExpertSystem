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
            CliUtil.err(ctx, String.format("Variable '%s' has been defined previously.", varName));
            return true;
        }
        return false;
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
        if(ctx.left != null)
            res.left = (float)visit(ctx.left);
        if(ctx.right != null)
            res.right = (float)visit(ctx.right);
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
