package Lv0;

import java.util.Scanner;

public class DivideNumber {
    public static void main(String[] args) { // ctrl alt l 코드 정리 (홀리 머더)
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0 , count =String.valueOf(number).length(); i<count; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
