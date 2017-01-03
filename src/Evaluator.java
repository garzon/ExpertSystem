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
    public boolean hasError = false;

    public static String trim(String id) {
        return id.substring(1, id.length() - 1);
    }

    @Override public ExpertRuleVar visitNumDeclare(ExpertRuleParser.NumDeclareContext ctx) {
        String varName = trim(ctx.id.getText());
        ExpertRuleVar res = vars.get(varName);
        res.readNumInput();
        return null;
    }

    @Override public ExpertRuleVar visitStrDeclare(ExpertRuleParser.StrDeclareContext ctx) {
        String varName = trim(ctx.id.getText());
        ExpertRuleVar res = vars.get(varName);
        res.readStrInput();
        return null;
    }
}