package programmers.Lv1;

public class MinSquare {
    public static void main(String[] args) {
        int[][] arr = {
                {60, 50},
                {30, 70}, // 70 30
                {60, 30},
                {80, 40}
        };
        System.out.println(solution(arr));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] <  sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        x = sizes[0][0];
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] > x) {
                x =  sizes[i][0];
            }
        }

        y = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][1] > y) {
                y = sizes[i][1];
            }
        }
        answer = x * y;
        return answer;
    }
}
