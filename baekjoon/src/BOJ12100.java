import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ12100 {
    static int n;
    static int map[][];
    static int max = 0;
    static int xDir[] = new int[]{-1, 0, 1, 0};
    static int yDir[] = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        map = new int[n + 2][n + 2];

        Arrays.fill(map[0], -1);
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = -1;
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
            map[i][n + 1] = -1;
        }
        Arrays.fill(map[n + 1], -1);


        dfs(map, 0);

        System.out.println(max);

    }

    private static void dfs(int[][] mapBoard, int length) {
        int copyMap[][] = new int[n + 2][n + 2];

        if (length == 5) {
            int temp = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    temp = Math.max(temp, mapBoard[i][j]);
                }
            }

            max = Math.max(max, temp);
            return;
        }


        for (int t = 0; t < 4; t++) {
            boolean visited[][] = new boolean[n + 2][n + 2];
            for (int i = 0; i <= n + 1; i++) {
                for (int j = 0; j <= n + 1; j++) {
                    copyMap[i][j] = mapBoard[i][j];
                }
                Arrays.fill(visited[i], false);
            }
            switch (t) {
                case 0:
                    for (int a = 1; a < n; a++) {
                        for (int b = 1; b <= n; b++) {
                            if (visited[a][b]) continue;
                            if (copyMap[a][b] > 0 && !visited[a][b]) {
                                int moveX = a + 1;
                                while (copyMap[moveX][b] == 0) {
                                    moveX++;
                                }
                                if (copyMap[moveX][b] == copyMap[a][b]) {
                                    copyMap[a][b] *= 2;
                                    copyMap[moveX][b] = 0;

                                    visited[a][b] = true;
                                    visited[moveX][b] = true;
                                }
                            }
                        }
                    }
                    for (int a = 2; a <= n; a++) {
                        for (int b = 1; b <= n; b++) {
                            int moveX = a - 1;
                            if (copyMap[moveX][b] == 0 && copyMap[a][b] > 0) {
                                while (copyMap[moveX - 1][b] == 0) {
                                    moveX--;
                                }
                                copyMap[moveX][b] = copyMap[a][b];
                                copyMap[a][b] = 0;
                            }
                        }
                    }

                    dfs(copyMap, length + 1);
                    break;
                case 1:
                    for (int a = 1; a <= n; a++) {
                        for (int b = 1; b < n; b++) {
                            if (visited[a][b]) continue;

                            if (copyMap[a][b] > 0 && !visited[a][b]) {
                                int moveY = b + 1;
                                while (copyMap[a][moveY] == 0) {
                                    moveY++;
                                }
                                if (copyMap[a][moveY] == copyMap[a][b]) {
                                    copyMap[a][b] *= 2;
                                    copyMap[a][moveY] = 0;

                                    visited[a][b] = true;
                                    visited[a][moveY] = true;
                                }
                            }
                        }
                    }
                    for (int a = 1; a <= n; a++) {
                        for (int b = 2; b <= n; b++) {
                            int moveY = b - 1;
                            if (copyMap[a][moveY] == 0 && copyMap[a][b] > 0) {
                                while (copyMap[a][moveY - 1] == 0) {
                                    moveY--;
                                }
                                copyMap[a][moveY] = copyMap[a][b];
                                copyMap[a][b] = 0;
                            }
                        }
                    }

                    dfs(copyMap, length + 1);
                    break;
                case 2:
                    for (int a = n; a > 1; a--) {
                        for (int b = n; b >= 1; b--) {
                            if (visited[a][b]) continue;

                            if (copyMap[a][b] > 0 && !visited[a][b]) {
                                int moveX = a - 1;
                                while (copyMap[moveX][b] == 0) {
                                    moveX--;
                                }
                                if (copyMap[moveX][b] == copyMap[a][b]) {
                                    copyMap[a][b] *= 2;
                                    copyMap[moveX][b] = 0;

                                    visited[a][b] = true;
                                    visited[moveX][b] = true;
                                }
                            }
                        }
                    }
                    for (int a = n - 1; a >= 1; a--) {
                        for (int b = n; b >= 1; b--) {
                            int moveX = a + 1;
                            if (copyMap[moveX][b] == 0 && copyMap[a][b] > 0) {
                                while (copyMap[moveX + 1][b] == 0) {
                                    moveX++;
                                }
                                copyMap[moveX][b] = copyMap[a][b];
                                copyMap[a][b] = 0;
                            }
                        }
                    }

                    dfs(copyMap, length + 1);
                    break;
                case 3:
                    for (int a = n; a >= 1; a--) {
                        for (int b = n; b > 1; b--) {
                            if (visited[a][b]) continue;

                            if (copyMap[a][b] > 0 && !visited[a][b]) {
                                int moveY = b - 1;
                                while (copyMap[a][moveY] == 0) {
                                    moveY--;
                                }
                                if (copyMap[a][moveY] == copyMap[a][b]) {
                                    copyMap[a][b] *= 2;
                                    copyMap[a][moveY] = 0;

                                    visited[a][b] = true;
                                    visited[a][moveY] = true;
                                }
                            }
                        }
                    }
                    for (int a = n; a >= 1; a--) {
                        for (int b = n - 1; b >= 1; b--) {
                            int moveY = b + 1;
                            if (copyMap[a][moveY] == 0 && copyMap[a][b] > 0) {
                                while (copyMap[a][moveY + 1] == 0) {
                                    moveY++;
                                }
                                copyMap[a][moveY] = copyMap[a][b];
                                copyMap[a][b] = 0;
                            }
                        }
                    }

                    dfs(copyMap, length + 1);
                    break;
            }
        }

    }
}
