import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;


public class Solution_메뉴리뉴얼 {
    static HashMap<String, Integer> map = new HashMap<>();
    static int m;
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < course.length; i++) {
            map = new HashMap<>();
            m=0;
            for (int j = 0; j < orders.length; j++) {
                menu(0,"", course[i], 0, orders[j]);
            }
            for (String word : map.keySet()) {
                if(map.get(word)==m&&m>1){
                    pq.offer(word);
                }
            }
        }
        String ans[] = new String[pq.size()];
        int idx=0;
        while(!pq.isEmpty()){
            ans[idx++]=pq.poll();
        }
        for (String word : ans) {
            System.out.println(word);
        }


    }

    private static void menu(int cnt, String result, int target, int index, String word) {
        if(cnt ==target){
            char[] str = result.toCharArray();
            Arrays.sort(str);
            String com = "";
            for (int i = 0; i < str.length; i++) {
                com+=str[i];
            }
            map.put(com, map.getOrDefault(com, 0)+1);
            m=Math.max(m, map.get(com));
            for (String s : map.keySet()) {
                System.out.println(s);
            }
            return;
        }
        for (int i = index; i < word.length(); i++) {
            char now = word.charAt(i);
            menu(cnt+1, result+now, target, i+1, word);
        }
    }
   
}
