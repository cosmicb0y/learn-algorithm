import java.util.Scanner;

public class BOJ11403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] > 0) {
                    dfs(i, j, n, map, visited);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int from, int y, int n, int[][] map, boolean[][] visited) {
        map[from][y] = 1;
        visited[from][y] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[from][i] && map[y][i] > 0) {
                dfs(from, i, n, map, visited);
            }
        }
    }
}
