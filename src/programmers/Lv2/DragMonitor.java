package programmers.Lv2;

public class DragMonitor {
    public static void main(String[] args) { // 풀이중
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        /*
        ..........
        .....#....
        ......##..
        ...##.....
        ....#.....
        * */
        System.out.println(solution(wallpaper)); // 1 3 5 8
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 0; // 시작 x
        int luy = 0; // 시작 y
        int rdx = 0; // 종료 x
        int rdy = 0; // 종료 y

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                lux = i;
                rdx = i;
            }
        }
        return answer;
    }
}
