
public class H13_Dfs_반복문 {
	public static int[][] map = { {}, { 2, 3 }, { 4, 5 }, { 7 }, { 6 }, { 2, 6 }, { 5, 7 }, { 3, 6 } };
	public static boolean[] visited;
	public static boolean[] visited2;

	public static void main(String[] args) {
		int[] stack = new int[100];
		int[] stack2 = new int[100];
		int top = -1;
		int top2 = -1;
		visited = new boolean[map.length];
		visited2 = new boolean[map.length];
		int v = 1;
		int v2 = 1;

		stack[++top] = v;
		visited[v] = true;
		System.out.print(v + " ");
		while (top > -1) {
			int w = -1;
			for (int i = 0; i < map[v].length; i++) {

				if (!visited[map[v][i]]) {
					w = map[v][i];
					visited[w] = true;
					stack[++top] = w;
					System.out.print(w + " ");
					v = w;
					break;
				}
			}
			if (w == -1) {
				v = stack[top--];
			}
		}
		System.out.println();
		stack2[++top2] = v2;
		visited[v2] = true;
		System.out.print(v2 + " ");
		while (top2 > -1) {
			int w = -1;
			for (int i = map[v2].length - 1; i >= 0; i--) {

				if (!visited2[map[v2][i]]) {
					w = map[v2][i];
					visited2[w] = true;
					stack2[++top2] = w;
					System.out.print(w + " ");
					v2 = w;
					break;
				}
			}
			if (w == -1) {
				v2 = stack2[top2--];
			}
		}
	}

}// end of class
