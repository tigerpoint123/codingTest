package programmers.Lv1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(solution(100000));
    }
    public static int solution(int n) {
        int answer = 0;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i < n; i ++) {
            f[i] = (f[i-1] + f[i-2]) % 1234567;
        }
        answer = (f[n-1] + f[n-2]) % 1234567;
        return answer;
    }
}
