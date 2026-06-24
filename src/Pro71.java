import java.util.*;

class Pro71 {
//    public String simplifyPath(String path) {
//
//        String[] parts = path.split("/");
//        Stack<String> stack = new Stack<>();
//
//        for (String part : parts) {
//            if (part.equals("..")) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else if (!part.equals("") && !part.equals(".")) {
//                stack.push(part);
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (String dir : stack) {
//            result.append("/").append(dir);
//        }
//
//        return result.length() > 0 ? result.toString() : "/";
//
//    }

    public String simplifyPath(String path) {

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] updatedPath = path.split("/");

        for (String dir : updatedPath){
            if (dir.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!dir.equals("") && !dir.equals(".")){
                stack.push(dir);
            }
        }


        StringBuilder result = new StringBuilder();
        List<String>  dirs = new ArrayList<>(stack);
        Collections.reverse(dirs);
        for (String dir : dirs) {
            result.append("/").append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";

    }

}