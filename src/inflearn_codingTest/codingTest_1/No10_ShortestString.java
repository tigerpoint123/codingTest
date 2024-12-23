package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

/*
*한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

teachermode e > 1 0 1 2 1 0 1 2 2 1 0

 * */
public class No10_ShortestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        char[] ch = str.toCharArray();
        int[] arr = new int[str.length()];

        int p = 1000;
        int q = 1000;

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != c) {
                p += 1;
                arr[i] = p;
            } else if (ch[i] == c) {
                p = 0;
                arr[i] = p;
            }
        }
        for(int i = ch.length - 1; i >= 0; i--) {
            if(ch[i] != c) {
                q += 1;
                if(arr[i] > q) arr[i] = q;
            } else {
                q = 0;
                arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
