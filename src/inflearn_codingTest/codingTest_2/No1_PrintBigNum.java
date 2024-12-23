package inflearn_codingTest.codingTest_2;


import java.util.ArrayList;
import java.util.Scanner;

/*N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)

6
7 3 9 5 6 12 > 7 9 6 12

*
* */
public class No1_PrintBigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] num = new int[count];

        for(int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(num[0]);
        for(int j=1;j<count;j++){
            if(num[j] > num[j-1]) list.add(num[j]);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
