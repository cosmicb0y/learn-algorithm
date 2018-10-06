import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15684 {
    static int[][] ladder;
    static boolean[][] visited;
    static int n;
    static int h;
    static int min = 4;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        ladder = new int[h * 2 + 1][n * 2 + 1];
        visited = new boolean[h * 2][n * 2 + 1];

        for (int i = 0; i < h * 2; i++) {
            for (int j = 1; j < n * 2 + 1; j += 2) {
                ladder[i][j] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ladder[a * 2 - 1][b * 2] = 1;
        }


        boolean answer = count();

        if (answer) min = 0;

        if (min > 3) {
            for (int i = 1; i < h * 2 + 1; i += 2) {
                for (int j = 2; j < n * 2; j += 2) {
                    if (!visited[i][j] && ladder[i][j] == 0) {
                        dfs(i, j, 1);
                    }
                }
            }
        }

        if (min > 3) min = -1;

        System.out.println(min);

    }

    private static void dfs(int x, int y, int length) {
        if (length < 4) {
            ladder[x][y] = 1;
            visited[x][y] = true;

            boolean answer = count();

            if (answer) min = Math.min(min, length);


            for (int i = x; i < h * 2 + 1; i += 2) {
                for (int j = 2; j < n * 2; j += 2) {
                    if (!visited[i][j] && ladder[i][j] == 0) {
                        dfs(i, j, length + 1);
                    }
                }
            }
        }
        visited[x][y] = false;
        ladder[x][y] = 0;
    }

    private static boolean count() {
        boolean answer = true;
        for (int j = 1; j < n * 2; j += 2) {
            int curY = j;

            for (int i = 0; i < h * 2 + 1; i++) {
                if (ladder[i][curY + 1] == 1) {
                    while (ladder[i][curY + 1] == 1) {
                        curY++;
                    }
                } else if (ladder[i][curY - 1] == 1) {
                    while (ladder[i][curY - 1] == 1) {
                        curY--;
                    }
                }
            }
            if (curY != j) {
                answer = false;
            }
        }
        return answer;
    }
}
