import java.util.Scanner;

public class BJ_9663_N_Queen_Main {
    public static int N, answer;
    public static int[] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        answer=0;
        map = new int[N];
        dfs(0);
        //백트래킹 방법
        System.out.println(answer);
    }

    private static void dfs(int depth) {
        if(depth==N){
            answer++;
            //체스판의 모든 행에 퀸을 배치해야 끝나기 때문에 들어가는 종료 조건
            return;
        }
        for (int i = 0; i < N; i++) {
            map[depth]=i;
            if(check(depth)){
                //조건 체크를 위한 if 절
                dfs(depth+1);
            }
        }
    }

    private static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if(map[col]==map[i]){
                //다음 배치의 퀸이 같은 열에 존재하면 false
                return false;
            }
            else if(Math.abs(col-i)==Math.abs(map[col]-map[i])){
                //대각선 상의 위치에 다음 퀸이 존재할 경우
                return false;
            }
        }
        return true;
        
    }
}
