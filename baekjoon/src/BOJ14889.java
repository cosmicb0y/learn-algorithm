import java.util.Scanner;

public class BOJ14889 {
    static int[][] map;
    static boolean[] visited;
    static int n;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        visited = new boolean[n];

        dfs(0, 0, 0);

        System.out.println(min);
    }

    private static void dfs(int index, int v, int depth) {
        if (depth == n/2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = i; j < n; j++) {
                        if (visited[j]) {
                            sum1 += map[i][j] + map[j][i];
                        }
                    }
                }
                else {
                    for (int j = i; j < n; j++) {
                        if (!visited[j]) {
                            sum2 += map[i][j] + map[j][i];
                        }
                    }
                }
            }

            min = Math.min(min, Math.abs(sum1 - sum2));
        }
        else {
            for (int i = index; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(i + 1, i, depth + 1);
                }
            }
        }

        visited[v] = false;

    }
}
