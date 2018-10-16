import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14500 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int max = Integer.MIN_VALUE;
    static int xDir[] = new int[]{-1, 0, 1, 0};
    static int yDir[] = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 2][m + 2];
        visited = new boolean[n + 2][m + 2];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= m; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, map[i][j]);
                visited[i][j] = false;
            }
        }

        System.out.println(max);
    }

    private static void dfs(int x, int y, int length, int sum) {
        if (length == 4) {
            max = Math.max(max, sum);
            return;
        }
        if (length == 2) {
            for (int i = 0; i < 4; i++) {
                int nextX = x + xDir[i];
                int nextY = y + yDir[i];
                if (!visited[nextX][nextY] && map[nextX][nextY] > 0) {
                    visited[nextX][nextY] = true;
                    sum += map[nextX][nextY];
                    for (int j = 0; j < 4; j++) {
                        int nextX2 = x + xDir[j];
                        int nextY2 = y + yDir[j];
                        if (!visited[nextX2][nextY2] && map[nextX2][nextY2] > 0) {
                            visited[nextX2][nextY2] = true;
                            dfs(nextX2, nextY2, length + 2, sum + map[nextX2][nextY2]);
                            visited[nextX2][nextY2] = false;
                        }
                    }
                    visited[nextX][nextY] = false;
                    sum -= map[nextX][nextY];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            int nextX = x + xDir[i];
            int nextY = y + yDir[i];
            if (!visited[nextX][nextY] && map[nextX][nextY] > 0) {
                visited[nextX][nextY] = true;
                dfs(nextX, nextY, length + 1, sum + map[nextX][nextY]);
                visited[nextX][nextY] = false;
            }
        }
    }
}
