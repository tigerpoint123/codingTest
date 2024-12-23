package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

public class No7_FrontBackSameString {
    /*
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

gooG >  YES
*
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
//        int lt = 0;
//        int rt = input.length()-1;
//
//        for(int i = lt; i <= rt; i++) {
//            if (input.charAt(i) == Character.toUpperCase(input.charAt(rt)) || input.charAt(i) == Character.toLowerCase(input.charAt(rt))) {
//                output = "YES";
//            } else{
//                output = "NO";
//            }
//
//        }
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(tmp)) {
            output = "YES";
        } else output = "NO";

        System.out.println(output);
    }
}
