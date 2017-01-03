import java.util.*;

/**
 * Created by ougar_000 on 2017/1/3.
 */
public class ExpertRuleVar {
    public String name;
    public Float left, right;
    public HashSet<String> values;

    public Object value;
    public String type;

    public static ExpertRuleVar makeBool(boolean v) {
        ExpertRuleVar res = new ExpertRuleVar();
        res.value = v;
        res.type = "boolean";
        return res;
    }

    public static ExpertRuleVar makeError() {
        ExpertRuleVar res = new ExpertRuleVar();
        res.type = "error";
        return res;
    }

    public static ExpertRuleVar makeVoid() {
        ExpertRuleVar res = new ExpertRuleVar();
        res.type = "void";
        return res;
    }

    public boolean isError() {
        return (type != null) && (type.equals("error"));
    }

    public static Scanner scanIn = new Scanner(System.in);

    public void readNumInput() {
        while(true) {
            System.out.printf("Please input '%s' ", name);
            if(left != null) {
                System.out.printf("greater than %f ", left);
            }
            if(right != null)
                System.out.printf("smaller than %f ", right);
            System.out.println(":");
            String input = scanIn.nextLine();
            float parsed;
            try {
                parsed = Float.parseFloat(input);
            } catch(NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue;
            }
            if((left != null && parsed < left) || (right != null && parsed > right)) {
                System.out.println("The number must be in the range. Please try again.");
                continue;
            }
            value = parsed;
            return;
        }
    }

    public void readStrInput() {
        while(true) {
            System.out.printf("Please input '%s', must be one of {", name);
            for(String validVal: values) {
                System.out.printf("'%s', ", validVal);
            }
            System.out.println("}:");
            String input = scanIn.nextLine();
            if(!values.contains(input)) {
                System.out.println("The string must be one of the above values. Please try again.");
                continue;
            }
            value = input;
            return;
        }
    }

}
