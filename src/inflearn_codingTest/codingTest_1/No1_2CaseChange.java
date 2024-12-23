package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

public class No1_2CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";

        char[] ch = input.toCharArray();

        for (char c : ch) {
//            if(Character.isUpperCase(c)) {
//                c = Character.toLowerCase(c);
//            } else{
//                c = Character.toUpperCase(c);
//            }
//            result += String.valueOf(c);
            if(c >= 65 && c <= 90) {
                result += (char)(c + 32);
            } else if(c >= 97 && c <= 122) {
                result += (char)(c - 32);
            }
        }

        System.out.println(result);
    }
}
