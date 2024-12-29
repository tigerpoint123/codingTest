package programmers.Lv1.billInWallet;

public class BillInWallet {
    public static void main(String[] args) {
        int[] wallet = {50, 50};
        int[] bill = {100, 241};
        int answer = 0;
        while(true) {
            if(bill[0] > bill[1]) {
                bill[0] = bill[0]/2;
                answer ++;
            } else {
                bill[1] = bill[1] / 2;
                answer ++;
            }


            if((bill[0] <= wallet[0] || bill[0] <= wallet[1])
                    && (bill[1] <= wallet[0] || bill[1] <= wallet[1])) {
                break;
            }
        }

        System.out.println(answer);
    }
}
