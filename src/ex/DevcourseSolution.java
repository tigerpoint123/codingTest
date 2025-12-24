package ex;

public class DevcourseSolution {
    public static void main(String[] args) {
        int[] food = new int[]{1, 7, 1, 2};
        int[] food2 = new int[]{1, 3, 4, 6};

        System.out.println(solution(food));
        System.out.println(solution(food2));
    }

    public static String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            int times = food[i]/2;
            String resultString = Integer.toString(i);
            for(int j=0; j<times; j++){
                answer += resultString;
            }
        }
        String reverse = reverseString(answer);
        answer += "0";
        answer += reverse;

        return answer;
    }

    public static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
