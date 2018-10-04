import java.util.Scanner;

public class BOJ1012 {
    static int[][] map;
    static boolean[][] visited;
    static int m;
    static int n;
    static int bug;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            bug = 0;

            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();

            map = new int[m + 2][n + 2];
            visited = new boolean[m + 1][n + 1];

            for (int i = 0; i < k; i++) {
                map[sc.nextInt() + 1][sc.nextInt() + 1] = 1;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        bug++;
                    }
                }
            }

            System.out.println(bug);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + xDir[i];
            int nextY = y + yDir[i];
            if (map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                dfs(nextX, nextY);
            }
        }
    }
}
