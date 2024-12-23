package inflearn_codingTest.codingTest_1;

import java.util.ArrayList;
import java.util.Scanner;

public class No1_4FilpWords { // good -> doog / time -> emit / big -> gib
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] words = new String[n];
//
//        for(int i = 0; i < n; i++) {
//            String str = sc.next();
//            StringBuffer sb = new StringBuffer(str);
//            String word = sb.reverse().toString();
//            words[i] = word;
//        }
//
//        for(int i = 0; i < n; i++) {
//            System.out.println(words[i]);
//        }
        No1_4FilpWords obj = new No1_4FilpWords();

        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String s : obj.solution(n, str)) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
//            String tmp = new StringBuilder(s).reverse().toString();
//            answer.add(tmp);
            char[] x = s.toCharArray();
            int lt = 0;
            int rt = x.length - 1;

            while(lt < rt) {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(x);
            answer.add(tmp);
        }
        return answer;
    }

}
