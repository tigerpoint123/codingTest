package baekjoon.stage3;

import java.util.Scanner;

public class No8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
