package programmers.Lv1;

public class HarshadInt {
	public static void main(String[] args) {
		int a = 11;
		String b = "11";
		int sum = 0;
		char[] charArray = b.toCharArray();

		for (char c : charArray) {
			int temp = c - '0';
			sum += temp;
		}

		if(a % sum == 0)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
