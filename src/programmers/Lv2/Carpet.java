package programmers.Lv2;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24, 24)));
    }
    /*
    1111111
    1000001
    1000001
    1111111
    * */

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int[] temp = new int[2];
        temp[0] = sum;

        for(int i = 2; i < brown; i++) {
            if (sum % i != 0) {
                continue;
            }
            int b = sum / i;
            temp[1] = Math.min(temp[0], (i + b));
            if (temp[1] < temp[0]) {
                temp[0] = temp[1];
                temp[1] = 0;
                if ((b - 2) * (i - 2) == yellow) {
                    answer[0] = b;
                    answer[1] = i;
                }
            } else break;
        }
        return answer;
    }
}
