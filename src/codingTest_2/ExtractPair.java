package codingTest_2;

import java.util.Arrays;
import java.util.Stack;

public class ExtractPair {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }

    static int solution(String s)
    {
        int answer = 0;
        answer = getStrings(s);
        return answer;
    }

    static int getStrings(String s) {
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(stack.isEmpty() || !stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            } else {
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return 1;
        } else return 0;

    }
}
