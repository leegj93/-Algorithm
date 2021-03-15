import java.util.Arrays;

public class Solution_광고삽입 {
    public static void main(String[] args) {
        String play_time = "02:03:55";
        String adv_time = "00:14:15";
        String[] logs ={"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};

        int playtime = timeToSecond(play_time);
        int advtime = timeToSecond(adv_time);
        System.out.println("playtime: "+playtime+ ", " + "advtime: "+ advtime);

        long[] play_cnt = new long[logs.length]
        

    }

    private static int timeToSecond(String time) {
        int[] parse = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();

        return parse[0]*3600+ parse[1]*60 + parse[2];
    }
}
