package programmers.Lv1;

public class NumAndWords {
    public static void main(String[] args) {
        String s = "one4seven";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            System.out.println((int) c);
        }
    }
}
