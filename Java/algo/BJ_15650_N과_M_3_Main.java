import java.util.Scanner;

public class BJ_15650_N과_M_3_Main {
    public static int[] arr;
    private static int N;
    private static int M;
    public static StringBuilder sb = new  StringBuilder();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr= new int[M];
        DFS(1,0);
        System.out.println(sb);


    }

    private static void DFS(int idx, int depth) {
        if(depth == M){
           for (int i : arr) {
                sb.append(i).append(" ");
           }
           sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
          
                arr[depth]=i;
                DFS(i, depth+1);
            

        }

    }
}
