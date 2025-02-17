package programmers.Lv1;

public class IntDescendingOrder {
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		String num = String.valueOf(n);
		char[] arr = num.toCharArray();

		for(int i = 0; i < num.length(); i++) {
			for(int j = i; j < num.length(); j++) {
				int before = arr[i] - '0';
				int after = arr[j] - '0';
				if(before < after) {
					int temp = before;
					arr[i] = arr[j];
					arr[j] = String.valueOf(temp).charAt(0);
				}
			}
		}
		answer = Long.parseLong(String.valueOf(arr));
		System.out.println(answer);
	}
}
