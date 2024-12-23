package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

/*
*알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

단 반복횟수가 1인 경우 생략합니다.

KKHSSSSSSSE >> K2HS7E
*
* KSTTTSEEKFKKKDJJGG > KST3SE2KFK3DJ2G2
*
* */

public class No11_StringPresure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + " ";
        char[] ch = s.toCharArray();
        String answer = "";
        int count = 1;
        String tmp = "";

        for (int i = 0; i < s.length() -1; i++) {
            tmp = String.valueOf(s.charAt(i));

            if(tmp.equals(String.valueOf(s.charAt(i+1)))) {
                count ++;
            } else if(count > 1) {
                answer += tmp + count;
                count = 1;
            } else if (count == 1) {
                answer += tmp;
                count = 1;
            }
        }

        System.out.println(answer);
    }
}
