import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pro150 {

    public int evalRPN(String[] tokens) {

//        Stack<Integer> result = new Stack<>();
//
//        for (int i = 0; i < tokens.length; i++) {
//            String token = tokens[i];
//
//            if (token.equals("+")) {
//                int a = result.pop();
//                int b = result.pop();
//                result.push(b + a);
//            } else if (token.equals("-")) {
//                int a = result.pop();
//                int b = result.pop();
//                result.push(b - a);
//            } else if (token.equals("*")) {
//                int a = result.pop();
//                int b = result.pop();
//                result.push(b * a);
//            } else if (token.equals("/")) {
//                int a = result.pop();
//                int b = result.pop();
//                result.push(b / a);
//            } else {
//                result.push(Integer.parseInt(token));
//            }
//        }
//
//        return result.pop();


        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();

    }

}
