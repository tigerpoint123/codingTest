package codingTest_1;

import java.util.Scanner;

public class No1_1FindString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        int count = 0;
        for (String s : input1.split("")) {
            if(input2.equalsIgnoreCase(s)) count++;
        }

        System.out.println(count);

//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        char c = kb.next().charAt(0);
//
//        str = str.toUpperCase();
//        c = Character.toUpperCase(c);
//
//        int count = 0;
//        for (int i =0; i<str.length(); i++) {
//            if(str.charAt(i) == c) count++;
//        }
//        System.out.println(count);
    }
}
