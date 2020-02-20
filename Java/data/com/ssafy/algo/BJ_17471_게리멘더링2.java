package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class BJ_17471_게리멘더링2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        people = new int[N+1];
        election = new int[N+1];
        visited = new boolean[N+1];
        connect = new boolean[N+1][N+1];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++ ) {
            people[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt, other;
        for(int i = 1 ; i <= N; i++ ) {
            st = new StringTokenizer(br.readLine());
            cnt = Integer.parseInt(st.nextToken());
            for(int c = 0 ; c < cnt ; c++) {
                other = Integer.parseInt(st.nextToken());
                connect[i][other] = true;
            }
        }
        
        dfs(1);
        if(min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
        
    }
    static int N;
    static int[] people;
    static boolean[][] connect;
    
    static int[] election ; //  1 또는 2 
    static int min = Integer.MAX_VALUE;
    // 모든 구여을 1 또는 2 선거구로 나누기
    static void dfs(int ei) {
        
        if(ei == N+1) {
            
            // 두 선거구 인원 구하기 
            int e1 = 0, e2 = 0;
            for(int e = 1 ; e <= N ; e++) {
                if(election[e] == 1) {
                    e1 += people[e];
                }else {
                    e2 += people[e];
                }
            }
            Arrays.fill(visited, false);
            
            // 요소 수 세기 
            int cnt = 0;
            for(int e = 1 ; e <= N; e++) {
                if(!visited[e]) {
                    makeConnect(e, election[e]);
                    cnt++;
                }
            }
            
            // 두 선거구로 나뉘어 있다면, 최소 min 구하기 
            if(cnt == 2) {
                if(min > Math.abs(e1 - e2)) {
                    min = Math.abs(e1 - e2);
                }
            }
            
            return;
        }
        
        election[ei] = 1;
        dfs(ei+1);
        
        election[ei] = 2;
        dfs(ei+1);
    }
    
    static boolean[] visited;
 
    // 연결되어 있는 모든 노드 방문. 
    static void makeConnect(int e, int num) {
        
        visited[e] = true;
        
        for(int i = 1 ; i <= N; i++) {
            if(connect[e][i] && !visited[i] && election[i] == num) {
                makeConnect(i, num);
            }
        }
    }
    
}