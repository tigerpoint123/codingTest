package baekjoon.stage6;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] chess = {1, 1, 2, 2, 2, 8};
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(chess[i] - Integer.parseInt(arr[i])).append(" ");
        }

        System.out.println(answer);
    }
}
