package baekjoon.stage4;

import java.util.Scanner;

public class No10807 { // 개수 세기
    public static void main(String[] args) {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int stand =  sc.nextInt();

        for(int i = 0; i < input; i++) {
            if (Integer.parseInt(str[i]) == stand) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
