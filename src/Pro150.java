import java.util.Stack;

public class Pro150 {

    public int evalRPN(String[] tokens) {

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b + a);
            } else if (token.equals("-")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b - a);
            } else if (token.equals("*")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b * a);
            } else if (token.equals("/")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b / a);
            } else {
                result.push(Integer.parseInt(token));
            }
        }

        return result.pop();

    }

}
