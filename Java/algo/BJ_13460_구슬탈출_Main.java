import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BJ_13460_구슬탈출_Main
 */
public class BJ_13460_구슬탈출_Main {
    public static int N, M;
    public static char[][] map;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean [][][][] visited;

    public static class Ball{
        int[] Red;
        int[] Blue;
        int move;
        public Ball(){
            this.move= 0;
        }
        public Ball(Ball now){
            this.Red = now.Red.clone();
            this.Blue = now.Blue.clone();
            this.move = now.move;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new char[N][M];
        Ball b = new Ball();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j]=str.charAt(j);
                if(map[i][j]=='R'){
                    b.Red=new int[] {i, j};
                    map[i][j]= '.';
                }else if(map[i][j]=='B'){
                    b.Blue = new int[]{i, j};
                    map[i][j]= '.';
                }
            }
        }//map 초기화
        visited = new boolean[N][M][N][M];
        Queue<Ball> q = new LinkedList<>();
        q.offer(b);
        visited[b.Red[0]][b.Red[1]][b.Blue[0]][b.Blue[1]]=true;
        while(!q.isEmpty()){
            Ball now = q.poll();
            if(map[now.Blue[0]][now.Blue[1]]=='O'){
                //실패 상황
                continue;
            }else if(now.move == 11){
                //시간초과 실패
                continue;
            }
            if(map[now.Red[0]][now.Red[1]]=='O'){
               //성공상황
               System.out.println(now.move);
               System.exit(0); 
            }
            //움직이는 상황
            for (int dir = 0; dir < 4; dir++) {
                    Ball next = move(dir, now);
                    if (visited[next.Red[0]][next.Red[1]][next.Blue[0]][next.Blue[1]])
                    continue;
                    visited[next.Red[0]][next.Red[1]][next.Blue[0]][next.Blue[1]] = true;
                    q.offer(next);
            }
        }
        System.out.println("-1");
        
    }//end of main

    private static Ball move(int dir, Ball now) {
        Ball next = new Ball(now);
        int nr = 0, nc = 0, flag =0;
        switch(dir)
        {
            case 0: //상
                if(next.Red[0]> next.Blue[0]){
                    //파란공이 더 위에 있음
                    //파란공이 먼저 움직임
                    flag = 0;
                }else 
                    flag = 1;

                break;
            case 1://하
                if(next.Red[0]>next.Blue[0]){
                    //빨간 공이 더 아래에 있기 때문에
                    // 빨간공이 더 먼저 움직임
                    flag = 1;
                }else
                    flag = 0;
                    break;
            case 2://좌
                if(next.Red[1]> next.Blue[1]){
                    //파란공이 더 왼쪽에 있음
                    // 파란 공이 더 먼저 움직임
                    flag = 0;   
                }else
                    flag = 1;
                break;
            case 3://우
                if(next.Red[1]>next.Blue[1]){
                    //빨간공이 더 오른쪽에 있음
                    // 빨간공이 더 먼저 움직임
                    flag = 1;
                }else
                    flag = 0;
                break;
        }
        //파란공이 먼저 움직이는 경우
        if(flag == 0){
            nr = next.Blue[0]+dr[dir];
            nc = next.Blue[1]+dc[dir];
            while(map[nr][nc]=='.'){
                // 맵의 상태가 . 일 때 계속 움직임
                nr +=dr[dir];
                nc +=dc[dir];
            }
            if (map[nr][nc] == 'O') {
                next.Blue = new int[] { nr, nc };
            } else
                next.Blue = new int[] { nr - dr[dir], nc - dc[dir] };
            nr = next.Red[0] + dr[dir];
            nc = next.Red[1] + dc[dir];
            while (map[nr][nc] == '.') {
                if (nr == next.Blue[0] && nc == next.Blue[1])
                    break;
                nr += dr[dir];
                nc += dc[dir];
            }
            if (map[nr][nc] == 'O') {
                next.Red = new int[] { nr, nc };
            } else
                next.Red = new int[] { nr - dr[dir], nc - dc[dir] };
        }
        else if (flag == 1) {
            nr = next.Red[0] + dr[dir];
            nc = next.Red[1] + dc[dir];
            while (map[nr][nc] == '.') {
                nr += dr[dir];
                nc += dc[dir];
            }
            if (map[nr][nc] == 'O') {
                next.Red = new int[] { nr, nc };
            } else
                next.Red = new int[] { nr - dr[dir], nc - dc[dir] };

            nr = next.Blue[0] + dr[dir];
            nc = next.Blue[1] + dc[dir];
            while (map[nr][nc] == '.') {
                if (nr == next.Red[0] && nc == next.Red[1])
                    break;
                nr += dr[dir];
                nc += dc[dir];
            }
            if (map[nr][nc] == 'O') {
                next.Blue = new int[] { nr, nc };
            } else
                next.Blue = new int[] { nr - dr[dir], nc - dc[dir] };
        }

        next.move++;
        return next;
    }

}