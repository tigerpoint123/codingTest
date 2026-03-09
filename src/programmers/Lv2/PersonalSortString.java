package programmers.Lv2;

import java.util.Arrays;

public class PersonalSortString {
    public static void main(String[] args) {
        String[] str = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution(str, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);
            strings[i] = c + strings[i];
        }
        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }

        return answer;
    }

}
