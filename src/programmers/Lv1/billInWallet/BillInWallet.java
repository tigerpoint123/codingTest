package programmers.Lv1.billInWallet;

public class BillInWallet {
    public static void main(String[] args) {
        int[] wallet = {30, 15};
        int[] bill = {26, 17};
        int answer = 0;
        while(true) {
            int tempW = 0;
            int tempB = 0;
            if(wallet[0] < wallet[1]){
                tempW = wallet[0];
                wallet[0] = wallet[1];
                wallet[1] = tempW;
            }
            if(bill[0] < bill[1]){
                tempB = bill[0];
                bill[0] = bill[1];
                bill[1] = tempB;
            }

            if(bill[0] <= wallet[0] && bill[1] <= wallet[1]) break;

            if(bill[0] > bill[1]) {
                bill[0] = bill[0]/2;
                answer ++;
            } else if(bill[0] < bill[1]) {
                bill[1] = bill[1] / 2;
                answer ++;
            } else {
                bill[0] = bill[0]/2;
                answer ++;
            }

        }

        System.out.println(answer);
    }
}
