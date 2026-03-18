package baekjoon.stage5;

import java.util.Scanner;

public class CharString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int index = input.nextInt();

        System.out.println(str.charAt(index - 1));
    }
}
