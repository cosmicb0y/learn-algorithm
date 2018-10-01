import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ14502 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int answer = 0;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n + 2][m + 2];
        visited = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n + 1; i++) {
            Arrays.fill(map[i], 1);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dfs(i, j, 1);
            }
        }


        System.out.println(answer);

    }

    private static void dfs(int x, int y, int length) {

        if (!visited[x][y] && map[x][y] == 0) {
            visited[x][y] = true;
            map[x][y] = 1;

            if (length == 3) {
                int[][] virusTest = new int[n + 2][m + 2];

                for (int i = 0; i <= n + 1; i++) {
                    for (int j = 0; j <= m + 1; j++) {
                        virusTest[i][j] = map[i][j];
                    }
                }

                Queue<Integer> xQueue = new LinkedList<>();
                Queue<Integer> yQueue = new LinkedList<>();

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (virusTest[i][j] == 2) {
                            xQueue.offer(i);
                            yQueue.offer(j);
                        }
                    }
                }

                while (!xQueue.isEmpty()) {
                    int a = xQueue.poll();
                    int b = yQueue.poll();

                    for (int i = 0; i < 4; i++) {
                        if (virusTest[a + xDir[i]][b + yDir[i]] == 0) {
                            virusTest[a + xDir[i]][b + yDir[i]] = 2;
                            xQueue.offer(a + xDir[i]);
                            yQueue.offer(b + yDir[i]);
                        }
                    }
                }

                int max = 0;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (virusTest[i][j] == 0) {
                            max++;
                        }
                    }
                }

                answer = Math.max(answer, max);
            }
            else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (!visited[i][j] && map[i][j] == 0) {
                            dfs(i, j, length + 1);
                        }
                    }
                }
            }
        }

        if (visited[x][y]) {
            visited[x][y] = false;
            map[x][y] = 0;
        }
    }
}
