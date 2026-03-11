package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No2480 {
    /*
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] num = input.nextLine().split(" ");
        Arrays.sort(num);

        if (num[0].equals(num[1])) {
            if (num[0].equals(num[2])) {
                System.out.println(tenK(Integer.parseInt(num[0])));
            }
            else {
                System.out.println(oneK(Integer.parseInt(num[0])));
            }
        } else if (num[1].equals(num[2])) {
            System.out.println(oneK(Integer.parseInt(num[1])));
        } else {
            System.out.println(Integer.parseInt(num[2]) * 100);
        }
    }

    public static int oneK(int input) {
        return 1000 + (100 * input);
    }

    public static int tenK(int input) {
        return 10000 + (1000 * input);
    }

}
