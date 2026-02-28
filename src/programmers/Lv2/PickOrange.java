package programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickOrange {
    public static void main(String[] args) {
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(solution(2, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexCount = new ArrayList<>();
        list.add(tangerine[0]);

        for (int i = 0; i < tangerine.length; i++) {
            if (list.get(list.size() - 1) != tangerine[i]) {
                list.add(tangerine[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < tangerine.length; j++) {
                if (list.get(i) == tangerine[j]) {
                    count++;
                }
            }
            indexCount.add(count);
        }
        Collections.sort(indexCount, Collections.reverseOrder());
        int temp = 0;
        for (int i = 0; i < indexCount.size(); i++) {
            temp += indexCount.get(i);
            answer ++;
            if (k <= temp) {
                break;
            }
        }

        return answer;
    }
}
