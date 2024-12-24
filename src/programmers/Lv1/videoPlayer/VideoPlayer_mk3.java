package programmers.Lv1.videoPlayer;

public class VideoPlayer_mk3 {
    public static void main(String[] args) {
        String video_len = "10:00";
        String pos = "10:00";
        String op_start = "01:00";
        String op_end = "02:00";
        // 기댓값 : 09:50
        String[] commands = {"next", "prev"};

        String[] position = pos.split(":");
        String pos_min = position[0];
        String pos_sec = position[1];
        int pos_min_int = Integer.parseInt(pos_min);
        int pos_sec_int = Integer.parseInt(pos_sec);
        String res_pos_min = "";
        String res_pos_sec = "";
        String[] op_start_arr = op_start.split(":");
        String[] op_end_arr = op_end.split(":");
        String op_start_min = op_start_arr[0];
        String op_start_sec = op_start_arr[1];
        int op_start_min_int = Integer.parseInt(op_start_min);
        int op_start_sec_int = Integer.parseInt(op_start_sec);
        String op_end_min = op_end_arr[0];
        String op_end_sec = op_end_arr[1];
        int op_end_min_int = Integer.parseInt(op_end_min);
        int op_end_sec_int = Integer.parseInt(op_end_sec);
        String[] video_len_arr = video_len.split(":");
        String video_len_min = video_len_arr[0];
        String video_len_sec = video_len_arr[1];
        int video_len_min_int = Integer.parseInt(video_len_min);
        int video_len_sec_int = Integer.parseInt(video_len_sec);

        int pos_len = pos_min_int * 60 + pos_sec_int;
        int op_start_len = op_start_min_int * 60 + op_start_sec_int;
        int op_end_len = op_end_min_int * 60 + op_end_sec_int;
        int video_len_len = video_len_min_int * 60 + video_len_sec_int;

        for(String command : commands) {
            if (pos_len >= op_start_len && pos_len <= op_end_len) {
                pos_len = op_end_len;
            }

            if(command.equals("next")) {
                pos_len += 10;
            } else {
                pos_len -= 10;
                if(pos_len < 0) {
                    pos_len = 0;
                }
            }
            if (pos_len >= op_start_len && pos_len <= op_end_len) {
                pos_len = op_end_len;
            }
            if (pos_len >= op_start_len && pos_len <= op_end_len) {
                pos_len = op_end_len;
            }
            if(pos_len > video_len_len) pos_len = video_len_len;
        }

        if (pos_len >= op_start_len && pos_len <= op_end_len) {
            pos_len = op_end_len;
        }
        if(pos_len > video_len_len) pos_len = video_len_len;

        pos_min_int = pos_len / 60;
        pos_sec_int = pos_len % 60;

        res_pos_min = String.format("%02d",pos_min_int);
        if(pos_min_int == 0) res_pos_min = "00";
        if(pos_sec_int == 0) res_pos_sec = "00";
        else res_pos_sec = String.format("%02d",pos_sec_int);

        String answer = res_pos_min + ":" + res_pos_sec;
        System.out.println(answer);
    }
}
