package com.ssafy.algo;


import java.util.Scanner;

public class JL_1863 {

	
	/**
	 *  a와 b가 같은 종교
	 *  b와 c가 페어일 경우
	 *  a- b -c 는 같은 종교
	 *  b와 d 가 페어일 경우
	 *  
	 *  a - b - c
	 *  	 |	
	 *        - d
	 * 노드 형식으로 붙이기
	 * 붙이고 난 다음 head 가 같으면 같은 종교
	 * Linkedlist를 이용해 풀이        
	 * a 와 b를 비교하여 
	 * @param args
	 */
	static int[] parents;
	static int[] depth;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parents=new int[N+1];
		depth = new int[N+1];
		 
		for(int i=1; i<N+1; i++) {
           
            parents[i]=i;
        }
		int ans=0;
		for (int i = 0; i < M; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			pair(a, b);
			
		}
		for (int i = 1; i < N+1; i++) {
		
//				System.out.println(graph.get(i));
			if (parents[i]==i) {
				ans++;
			}
		
		}
		System.out.println(ans);
		



	}//end of main
	public static void pair(int a, int b) {
		//1 다음 깊이의 숫자들은 2, 3, 4, 5, 6, 7, 8, 9  깊이가 얕을 수록 부모인 숫자
		//2나 다른 숫자의 부모 숫자는 1
		//2, 4 가 온다면 아무 쪽이 깊이를 증가
		int pa = find(a);
		int pb = find(b);
		if(depth[pb]>depth[pa]) {
			parents[pb]=pa;
		}else {
			parents[pb]=pa;
			if(depth[pb]==depth[pa]) {
				depth[pb]++;				
			}
		}
		
	}
	public static int find(int a) {
		if(a==parents[a]) {
			return a;
		}
		parents[a]=find(parents[a]);
		return parents[a];
				
	}

}
