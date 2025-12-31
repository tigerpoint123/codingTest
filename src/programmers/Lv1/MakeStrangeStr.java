package programmers.Lv1;

public class MakeStrangeStr {
    public static void main(String[] args) {
//        System.out.println(solution(" read the explanation carefully  ").equals(" ReAd ThE ExPlAnAtIoN CaReFuLlY  "));
//        System.out.println(solution("try  hello"));
        System.out.println(solution("a   bc d"));
    }
    public static String solution(String s) {
        String answer = "";
        int index = 0;
//        String[] strArr = s.split(" ");
//
//        for(int i = 0; i < strArr.length; i ++) {
//            for(int j = 0; j < strArr[i].length(); j++) {
//                char c = strArr[i].charAt(j);
//                if(j%2 == 0) {
//                    answer += Character.toUpperCase(c);
//                }
//            }
//        }
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);

            if(i > 0 && s.charAt(i-1) == ' ') {
                index = 0;
                answer += Character.toUpperCase(c);
            } else if (index%2 == 0) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }

            index ++;
        }

        return answer;
    }
}
