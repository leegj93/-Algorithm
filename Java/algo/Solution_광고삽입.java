import java.util.Arrays;

public class Solution_광고삽입 {
    public static void main(String[] args) {
        String play_time = "02:03:55";
        String adv_time = "00:14:15";
        String[] logs ={"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};

        int playtime = timeToSecond(play_time);
        int advtime = timeToSecond(adv_time);
        System.out.println("playtime: "+playtime+ ", " + "advtime: "+ advtime);

        long[] play_cnt = new long[playtime+1];
        for (String log : logs) {
            String[] split = log.split("-");
            play_cnt[timeToSecond(split[0])]++;
            System.out.println("log time : "+timeToSecond(split[0]));
            play_cnt[timeToSecond(split[1])]--;
        }
        for (int i = 1; i <= playtime; i++) {
            play_cnt[i] += play_cnt[i-1];
        }
        for (int i = 1; i <= playtime; i++) {
            play_cnt[i] += play_cnt[i-1];
        }
        long maxTime = play_cnt[advtime -1], maxStartTime = 0;
        for (int i = 0; i+ advtime <= playtime; i++) {
            long tmp = play_cnt[i +advtime] - play_cnt[i];

            if(tmp >maxTime){
                maxTime = tmp;
                maxStartTime = i+1;
            }
        }
        System.out.println(maxStartTime);
        System.out.println(String.format("%02d:%02d:%02d", maxStartTime / (60 * 60), (maxStartTime / 60) % 60, maxStartTime % 60));
    }

    private static int timeToSecond(String time) {
        int[] parse = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();

        return parse[0]*3600+ parse[1]*60 + parse[2];
    }
}
