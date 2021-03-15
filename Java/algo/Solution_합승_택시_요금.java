import java.util.*;

/**
 * Solution_택시
 */
public class Solution_합승_택시_요금 {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int answer = 0;
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares ={{4,1,10},{3,5,24},{5,6,2},{3,1,41},{5,1,24},{4,6,50},{2,4,66},{2,3,22},{1,6,25}};
        int[][] map = new int [n+1][n+1];
        //map 초기화
        
        for(int i = 0; i <=n; i++){
            Arrays.fill(map[i],1000000 );
            map[i][i] = 0;
        }
        // map에 요금 넣기
        for (int [] fare: fares){
            map[fare[0]][fare[1]]= map[fare[1]][fare[0]] = fare[2];
        }
       //플로이드 와샬 알고리즘으로 풀기
        for(int k = 1; k<= n; k++){
            for(int i = 1; i<=n; i++){
                for(int j = 1; j<=n; j++){
                    if(map[i][j]> map[i][k]+map[k][j])
                        map[i][j]=map[i][k]+map[k][j];
                }
            }
        }
        // answer값을 map의 시작점에서 a까지 가는 요금 + 시작점에서 b점까지 가는 요금으로 초기화
        answer = map[s][a] +map[s][b];
        //모든 정점을 돌면서 최소값을 비교 s -> i +(i->a+ i->b)값이 가는 거리
        for(int i = 1; i<=n; i++){
            answer = Math.min(answer, map[s][i]+map[i][a]+map[i][b]);
        }
        //    for(int[] test: map){
        //     for(int i=0; i< test.length; i++){
        //         System.out.print(test[i]+" ");
        //     }
        // }
        System.out.println(answer);
        //return answer;
    }
}