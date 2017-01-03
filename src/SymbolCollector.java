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

    public static String trim(String id) {
        return id.substring(1, id.length() - 1);
    }

    private boolean isDefined(ParserRuleContext ctx, String varName) {
        if(vars.get(varName) != null) {
            CliUtil.err(ctx, String.format("Variable '%s' has been defined previously.", varName));
            return true;
        }
        return false;
    }

    @Override public Object visitNumDeclare(ExpertRuleParser.NumDeclareContext ctx) {
        String varName = trim(ctx.id.getText());
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
        String varName = trim(ctx.id.getText());
        if(isDefined(ctx, varName)) {
            hasError = true;
            return null;
        }
        ExpertRuleVar res = new ExpertRuleVar();
        res.type = "string";
        res.name = varName;
        res.values = new HashSet<>();
        boolean isId = true;
        for(TerminalNode val: ctx.STRING()) {
            if(isId) {
                isId = false;
                continue;
            }
            res.values.add(trim(val.getText()));
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
            String varName = trim(val.getText());
            //addInitVar(ctx, varName);
            output.add(varName);
        }
        return null;
    }
}
