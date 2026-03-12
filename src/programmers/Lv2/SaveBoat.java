package programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SaveBoat {
    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        System.out.println(solution(people, 100)); // 3
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;

        for(int i = 0; i<people.length; i++){
            if(left > right){
                break;
            }

            if (people[left] + people[right] <= limit) {
                list.add(people[left] + people[right]);
                left++;
                right--;
            } else {
                list.add(people[right]);
                right--;
            }
        }
        answer = list.size();
        return answer;
    }
}
