package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

/*
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.


g0en2T0s8eSoft > 208
*
*
* */

public class No9_ExtractOnlyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";

        for (String string : s.split("")) {
            if(string.charAt(0) >= 48 && string.charAt(0) <= 57) str += string.charAt(0);
        }
        int num = Integer.parseInt(str);

        System.out.println(num);
    }
}
