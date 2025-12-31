package programmers.Lv2;

import java.util.Arrays;

public class RepeatBinaryChange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        int countZero = 0;
        int countTimes = 0;
        String temp = s;
        int after = 0;

        while (!temp.equals("1")) {
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '0') {
                    countZero++;
                }
            }
            temp = temp.replace("0", "");
            after = temp.length();
            temp = Integer.toBinaryString(after);
            countTimes++;
        }
        answer[0] = countTimes;
        answer[1] = countZero;
        return answer;
    }
}
