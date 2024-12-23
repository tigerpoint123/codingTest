package inflearn_codingTest.codingTest_1;

import java.util.Scanner;

/*
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

a#b!GE*T@S > S#T!EG*b@a
* */
public class No1_5FlipAFewString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        int lt = 0;
        int rt = s.length()-1;
        char[] c = s.toCharArray();
//
//            while(lt < rt) {
//                if (((c[lt] >= 48 && c[lt] <= 57) || (c[lt] >= 65 && c[lt] <= 90) || (c[lt] >= 97 && c[lt] <= 122)) &&
//                        ((c[rt] >= 48 && c[rt] <= 57) || (c[rt] >= 65 && c[rt] <= 90) || (c[rt] >= 97 && c[rt] <= 122)) ) {
//                    char temp = c[lt];
//                    c[lt] = c[rt];
//                    c[rt] = temp;
//                    lt++;
//                    rt--;
//                } else if (!((c[lt] >= 48 && c[lt] <= 57) || (c[lt] >= 65 && c[lt] <= 90) || (c[lt] >= 97 && c[lt] <= 122))) {
//                    lt++;
//                } else if (!((c[rt] >= 48 && c[rt] <= 57) || (c[rt] >= 65 && c[rt] <= 90) || (c[rt] >= 97 && c[rt] <= 122))) {
//                    rt--;
//                }
//
//        }
//        result = String.valueOf(c);
//        System.out.println(result);

/* ******************************************************************************************/
        while (lt < rt) {
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }

    }
}
