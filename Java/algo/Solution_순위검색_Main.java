import java.util.*;

public class Solution_순위검색_Main {
    
    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query ={"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        Map<String, List<Integer>> infos = new HashMap<>();
        for (String w : info) {
            String[] split = w.split(" ");
            // for (String string : split) {
            //     System.out.println(string);
            // }
            int score = Integer.parseInt(split[4]);
            // System.out.println(score);
            for (int i = 0; i < (1 << 4); i++){
                StringBuilder key = new StringBuilder();
                for (int j = 0; j < 4; j++) {
                    if((i& (1<<j))>0){
                        key.append(split[j]);
                    }
                }
                System.out.println(i);
            }
            
        }
    
    
    }//end of Main
}
