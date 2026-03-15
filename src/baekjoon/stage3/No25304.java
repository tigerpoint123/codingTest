package baekjoon.stage3;

import java.util.Scanner;

public class No25304 { // 영수증
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =  sc.nextInt();
        int sum = 0;
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            String stuff =  sc.nextLine();
            String[] stuffs = stuff.split(" ");
            sum += Integer.parseInt(stuffs[0]) * Integer.parseInt(stuffs[1]);
        }

        if (total == sum) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
