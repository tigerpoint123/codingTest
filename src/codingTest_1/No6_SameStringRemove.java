package codingTest_1;

import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * ksekkset > kset
 */


public class No6_SameStringRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";

        for(int i =0; i<s.length(); i++) {
            if(s.indexOf(s.charAt(i))==i) answer +=s.charAt(i);
        }
        System.out.println(answer);
    }
}
