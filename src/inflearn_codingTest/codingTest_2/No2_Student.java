package inflearn_codingTest.codingTest_2;

import java.util.ArrayList;
import java.util.Scanner;

/*선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

8
130 135 148 140 145 150 150 153 > 5

* */

public class No2_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] tall = new int[n];

        for(int i = 0; i < n; i++) {
            tall[i] = sc.nextInt();
        }

        

    }
}
