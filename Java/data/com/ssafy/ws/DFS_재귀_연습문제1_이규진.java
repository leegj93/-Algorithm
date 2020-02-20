
public class H13_Dfs_recursive {
	public static int[][] map = { {}, { 2, 3 }, { 4, 5 }, { 7 }, { 6 }, { 2, 6 }, { 5, 7 }, { 3, 6 } };
	public static boolean[] visited;
	public static boolean[] visited2;

	public static void main(String[] args) {
		visited = new boolean[map.length];
		dfs(1);
		System.out.println();
		visited2 = new boolean[map.length];
		dfs2(1);

	}

	public static void dfs2(int i) {
		if (visited2[i] == true) {

			return;
		}
		visited2[i] = true;
		System.out.print(i + " ");
		for (int j = map[i].length - 1; j >= 0; j--) {
			if (!visited2[map[i][j]]) {
				dfs2(map[i][j]);
			}

		}

	}

	public static void dfs(int i) {
		if (visited[i] == true) {

			return;
		}
		visited[i] = true;
		System.out.print(i + " ");
		for (int j = 0; j < map[i].length; j++) {
			if (!visited[map[i][j]]) {
				dfs(map[i][j]);
			}

		}

	}
}
