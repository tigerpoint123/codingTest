package programmers.Lv1;

public class SquareRoot {
	public static void main(String[] args) {
		long answer = Solution(121);
		System.out.println(answer);
	}

	private static long Solution(int n) {
		long answer = 0;
		long i = (long) Math.sqrt(n);
		if(Math.sqrt(n) <= i) {
			answer = (i+1) * (i+1);
			return answer;
		} else return -1;
	}
}
