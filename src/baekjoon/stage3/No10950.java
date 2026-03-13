package baekjoon.stage3;

import java.util.Scanner;

public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] s = new String[count];

        sc.nextLine();

        for(int i = 0; i < count; i++) {
            s[i] = sc.nextLine();
            String[] arr =  s[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println(a+b);
        }
    }
}
