package programmers.Lv2;

public class LongJump_ing {
    public static void main(String[] args) {
        System.out.println(solution(9));
    }
    /*
    1 1 1 1 1 1 1 1 1
    2 1 1 1 1 1 1 1
    2 2 1 1 1 1 1
    2 2 2 1 1 1
    2 2 2 2 1

    9!/9! + 8!/1!*7! + 7!/2!*5! + 6!/3!*3! + 5!/4!*1!
    * */

    public static long solution(int n) { // 9
        long answer = 0;
        int limit = n % 2 == 0 ? n / 2 : n / 2 + 1; // 5

        for(int i = 1 ; i <= limit; i++) {
            for(int j = 1 ; j <= limit; j++) {

            }
        }
        answer ++;
        return answer;
    }

}
