package codingTest_2;

public class ExpressionNumber {
    public static void main(String[] args) {
        int answer = run(15);
        System.out.println(answer);
    }

    static int run(int n) {
        int answer = 0;

        for(int i = 0; i < n; i ++) {
            int temp = 0;
            int j = i;
            while(true) {
                j++;
                temp += j;

                if(temp == n) {
                    answer ++;
                    break;
                } else if (temp > n) break;
            }
        }

        return answer;
    }
}
