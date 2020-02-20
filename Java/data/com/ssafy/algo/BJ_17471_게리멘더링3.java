package com.ssafy.algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ_17471_게리멘더링3 {
	private static Set<Integer>[] map;
	private static int size_map;
	private static int[] peopleCnt;
	public static void main(String[] args)
			throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size_map = Integer.parseInt(br.readLine());
		map = new HashSet[size_map];
		peopleCnt = new int[size_map];
		String str_people_cnt = br.readLine();
		StringTokenizer strToken = new StringTokenizer(str_people_cnt);
		for (int a = 0; a < size_map; a++) {
			peopleCnt[a] = Integer.parseInt(strToken.nextToken());//인구수 입력.
			map[a] = new HashSet<>();//지도 초기화.
		}
//		System.out.println(Arrays.toString(peopleCnt));
		for (int a = 0; a < size_map; a++) {
			String str_map_info = br.readLine();
			strToken = new StringTokenizer(str_map_info);
			String cnt = strToken.nextToken();
			while (strToken.hasMoreTokens()) {
				int b = Integer.parseInt(strToken.nextToken()) - 1;
				map[a].add(b);
				map[b].add(a);
			}
		}//지도 입력.
//		for (Set set : map) {
//			System.out.println(set);
//		}//입력 확인.
		int minGap = Integer.MAX_VALUE;
		for (int a = 1; a < Math.pow(2, size_map-1); a++) {
			List<Integer> group1 = new ArrayList<>();
			List<Integer> group2 = new ArrayList<>();
			for (int b = 0; b < size_map; b++) {
				if ((a & 1 << b) > 0) {
					group1.add(b);
				} else {
					group2.add(b);
				}
			}//두개의 조합 생성.
			int group1PeopleSum = bfs(group1);
			int group2PeopleSum = bfs(group2);//그룹별 인구수 추출.
//			System.out.print("group1 : " + group1 + " -> " + group1PeopleSum);
//			System.out.println("\t\tgroup2 : " + group2 + "->" + group2PeopleSum);
			if (group1PeopleSum > 0 && group2PeopleSum > 0) {
				minGap = Math.min(minGap
									, Math.abs(group1PeopleSum - group2PeopleSum));
			}//두 그룹의 인구수의 차이 확인.
		}//for
		if (minGap == Integer.MAX_VALUE) {
			minGap = -1;
		}
		System.out.println(minGap);
	}//main
	private static int bfs(List<Integer> group) {
		boolean[] visited = new boolean[size_map];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(group.get(0));

		int checkCnt = 0;
		int peopleSum = 0;
		while (!queue.isEmpty()) {
			Integer index = queue.poll();
			if (visited[index]) continue;

			visited[index] = true;
			checkCnt++;
			peopleSum = peopleSum + peopleCnt[index];

			Set<Integer> childs = map[index];
			for (Integer child : childs) {
				if (group.contains(child) && !visited[child]) {
					queue.add(child);
				}
			}//지도 상의 연관성 검사.
		}//while
		//System.out.println(group + " >>> " + cnt + " : " + group.size());
		if (checkCnt == group.size()) {//조합된 그룹의 크기만큼 검사.
			return peopleSum;
		} else {
			return -1;
		}
	}
}//class
