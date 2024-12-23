package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

public class No1_3WordInSentence {
    public static void main(String[] args) {
        No1_3WordInSentence wi = new No1_3WordInSentence();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(wi.solution(str));
    }

    private String solution(String str) {
//        String[] words = str.split(" ");
//        String result = "";
//
//        for(int i = 0; i < words.length; i++){
//            if(result.length() < words[i].length()){ result = words[i]; }
//        }
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }
}
