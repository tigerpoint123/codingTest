package programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SaveBoat {
    public static void main(String[] args) {
        int[] people = {70, 80, 40};
        System.out.println(solution(people, 120)); // 3
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> peopleList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        Arrays.sort(people);
        for (int i = people.length -1; i >= 0; i--) {
            peopleList.add(people[i]);
        }
        int peopleSize = peopleList.size();

        for (int i = 0; i < peopleSize; i ++) { // 80 70 50 50
            int temp = peopleList.get(i);

            for (int j = i + 1; j < peopleSize; j++) {
                if (temp + peopleList.get(j) <= limit) {
                    temp += peopleList.get(j);
                    peopleList.set(j, 0);
                }
            }
            answerList.add(temp);
        }

        for (Integer integer : answerList) {
            if (!integer.equals(0)) {
                answer++;
            }
        }
        return answer;
    }
}
