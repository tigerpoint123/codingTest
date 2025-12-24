package codingTest_2;

import java.util.Stack;

public class MatchParentheses {
    public static void main(String[] args) {
        String s = "(())()"; // true
        boolean answer = true;
//        String[] arr = s.split("");
//        Stack<String> stack = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            stack.push(arr[i]);
//
//            if(stack.size() >= 2) {
//                String right = stack.pop();
//                String left = stack.pop();
//
//                if (!(left.equals("(") && right.equals(")"))) {
//                    stack.push(left);
//                    stack.push(right);
//                }
//            }
//        }
//        if (!stack.isEmpty()) answer = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else {
                count--;
                if(count < 0) return;
            }

        }

        System.out.println(answer);
    }
}
