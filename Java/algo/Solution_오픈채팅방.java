import java.util.*;
import java.util.stream.Collectors;

public class Solution_오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Map<String, String> map = new HashMap<>();
        List<String[]> splitRecord = Arrays.stream(record).map(r -> r.split(" ")).collect(Collectors.toList());
        for (String[] r : splitRecord) {
            if(r[0].equals("Enter") || r[0].equals("Change")){
                map.put(r[1], r[2]);

            }
        }
        List<String> result = new ArrayList<>();

        for (String[] r : splitRecord) {
            switch(r[0]){
                case "Enter":
                    result.add(String.format("%s님이 들어왔습니다.", map.get(r[1])));
                    break;
                case "Leave":
                    result.add(String.format("%s님이 나갔습니다.", map.get(r[1])));
                    break;
            }
        }
        for (String string : result) {
            System.out.println(string);
        }
        //return result.toArray(new String[0]);
    
    }
    
}
