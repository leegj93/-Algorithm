import java.util.Scanner;

/**
 * BJ_15652_N과_M_4_Main
 */
public class BJ_15652_N과_M_4_Main {
    public static int N,M;
    public static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        arr= new int[M];
        DFS(1,0);
    }

    private static void DFS(int idx, int depth) {
        if(depth==M){
            for (int i : arr) {
                System.out.print(i +" ");
            }
            System.out.println();
            return;
        }
        for (int i = idx; i <= N; i++) {
           
                arr[depth]=i;
                DFS(i,depth+1);
             
        }
    }
}