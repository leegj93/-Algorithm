import java.util.Scanner;

public class BJ_15650_N과_M_2_Main {
    public static int[] arr;
    private static int N;
    private static int M;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr= new int[M];
        visited = new boolean[N+1];
        DFS(1,0);


    }

    private static void DFS(int idx, int depth) {
        if(depth == M){
           for (int i : arr) {
                System.out.print(i+ " ");
           }
           System.out.println();
            return;
        }
        for (int i = idx; i <= N; i++) {
            if(visited[i]!=true){
                visited[i]=true;
                arr[depth]=i;
                DFS(i, depth+1);
                visited[i]=false;
            }

        }

    }
}
