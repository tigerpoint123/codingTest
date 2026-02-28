package programmers.Lv1;

public class AntArmy {
    public static void main(String[] args) {
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int answer = 0;
        int big = hp / 5;
        int mid = (hp % 5) / 3;
        int small = (hp % 5) % 3;

        return answer = big + mid + small;
    }
}
