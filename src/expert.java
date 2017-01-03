/**
 * Created by ougar_000 on 2016/12/29.
 */

import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import science.garzon.ExpertSystem.*;

import java.nio.file.Files;

public class expert {

    public static ExpertRuleParser.GoalContext root;

    public static void main(String[] args) throws IOException {
        String sentence = new String(Files.readAllBytes(Paths.get("../knowledgeDatabase.txt")));

        ExpertRuleLexer lexer = new ExpertRuleLexer(new ANTLRInputStream(sentence));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExpertRuleParser parser = new ExpertRuleParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        parser.setBuildParseTree(true);

        ExpertRuleBaseListener treeSaver = new ExpertRuleBaseListener() {
            @Override public void enterGoal (ExpertRuleParser.GoalContext ctx){
                root = ctx;
            }
        };
        ParseTreeWalker.DEFAULT.walk(treeSaver, parser.goal());

        if(parser.getNumberOfSyntaxErrors() != 0) {
            System.err.println("There are errors in knowledge database. Break.");
            System.exit(1);
            return;
        }

        SymbolCollector collector = new SymbolCollector();
        collector.visit(root);

        if(parser.getNumberOfSyntaxErrors() != 0 || collector.hasError) {
            System.err.println("There are errors. Break.");
            System.exit(2);
            return;
        }

        CliUtil.isRuntime = true;
        Evaluator evaluator = new Evaluator();
        evaluator.vars = collector.vars;
        evaluator.output = collector.output;
        evaluator.visit(root.input());

        while(!evaluator.checkAllOutputAssigned()) {
            evaluator.isUpdated = false;
            for(ExpertRuleParser.IfStatementContext ctx: root.ifStatement()) {
                if(evaluator.visit(ctx).isError()) {
                    System.err.println("There are errors. Exit.");
                    System.exit(3);
                    return;
                }
            }
            if(!evaluator.isUpdated) {
                System.out.println("Cannot draw any more conclusions. Exit.");
                break;
            }
        }

        for(String outputVarName: evaluator.output) {
            if(!evaluator.vars.containsKey(outputVarName)) continue;
            System.out.printf("[Conclusion] '%s' should be '%s'.\n", outputVarName, evaluator.vars.get(outputVarName).value);
        }

        System.exit(0);
    }
}
