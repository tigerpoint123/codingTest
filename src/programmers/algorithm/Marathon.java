package programmers.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant , completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<Integer, String> pMap = new HashMap<>();
        Map<Integer, String> cMap = new HashMap<>();

        for(int i = 0; i<participant.length; i++) {
            pMap.put(i, participant[i]);
        }
        for(int i = 0; i<completion.length; i++) {
            cMap.put(i, completion[i]);
        }

        for(int i = 0; i < participant.length; i ++) {
            boolean iscontain = false;
            for(int j = 0; j < completion.length; j ++) {
                if(pMap.get(i).equals(cMap.get(j))) {
                    iscontain = true;
                }
                if(iscontain) {
                    cMap.remove(j);
                    pMap.remove(i);
                    break;
                }
            }
        }
        answer = pMap.values().iterator().next();
        return answer;
    }
}

