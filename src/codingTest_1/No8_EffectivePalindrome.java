package codingTest_1;

import java.util.Scanner;

/*앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다. 알파벳 이외의 문자들의 무시합니다.

found7, time: study; Yduts; emit, 7Dnuof > YES
*
* */
public class No8_EffectivePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer ="";
        String s = "";

//        for (String string : str.split("")) {
//            if(Character.isAlphabetic(string.charAt(0))) s += string;
//        }
//        s = s.toLowerCase();
//        int rt = s.length()-1;
//        char[] ch = s.toCharArray();
//
//        for (int i = 0; i < rt; i++) {
//            if(ch[i] == ch[rt]) {
//                answer = "YES";
//                rt--;
//            } else {
//                answer = "NO";
//                rt--;
//            }
//        }
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        System.out.println(answer);
    }
}
