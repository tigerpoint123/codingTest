package ex;

public class DevcourseSolution2 {
    public static void main(String[] args) {
        String[] board = new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        String[] board2 = new String[]{".D.R", "....", ".G..", "...D"};

        boardGame(board);
    }

    public static int boardGame(String[] board) {
        int result = 0;
        int rXLocation = 0;
        int rYLocation = 0;
        boolean isBreak = false;

        for(int i = 0; i < board.length; i++) {
            for (String s : board[i].split("")) {
                if (s.equals(".") || s.equals("D")) {
                    rXLocation++;
                } else {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak == true) {
                rYLocation = i;
                break;
            }

        }
//        System.out.println(rXLocation);
//        System.out.println(rYLocation);

        moveToDown(board);


        return 0;
    }

    public static void moveToDown(String[] board) {


    }

}

