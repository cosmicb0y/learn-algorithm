import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ16235 {
    static int[][] map;
    static int[][] tree;
    static boolean[][] dead;
    static int[][] energy;
    static int[][] fill;
    static int n;
    static int m;
    static int k;
    static int[] xDir = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] yDir = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        fill = new int[n][n];
        energy = new int[n][n];
        tree = new int[n * n][10000];
        dead = new boolean[n * n][10000];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                fill[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.fill(energy[i], 5);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            tree[x * n + y][map[x][y]] = Integer.parseInt(st.nextToken());
            map[x][y]++;
        }

        for (int year = 0; year < k; year++) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > 0) {
                        for (int k = 0; k < map[i][j]; k++) {
                            if (energy[i][j] >= tree[i * n + j][k]) {
                                energy[i][j] -= tree[i * n + j][k];
                                tree[i * n + j][k]++;
                            }
                            else {
                                dead[i * n + j][k] = true;
                            }
                        }
                    }
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > 0) {
                        int treeNum = map[i][j];
                        for (int k = 0; k < treeNum; k++) {
                            if (dead[i * n + j][k]) {
                                energy[i][j] += tree[i * n + j][k] / 2;
                                dead[i * n + j][k] = false;
                                map[i][j]--;
                            }
                        }
                    }
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > 0) {
                        int treeIndex = i * n + j;
                        for (int k = 0; k < map[i][j]; k++) {
                            if (tree[treeIndex][k] % 5 == 0) {
                                for (int l = 0; l < 8; l++) {
                                    int nextX = i + xDir[l];
                                    int nextY = j + yDir[l];
                                    if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                                        tree[nextX * n + nextY][map[nextX][nextY]] = 1;
                                        map[nextX][nextY]++;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < n * n; i++) {
                Arrays.sort(tree[i], 0, map[i / n][i % n]);
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    energy[i][j] += fill[i][j];
                }
            }

        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += map[i][j];
            }
        }

        System.out.println(sum);
    }
}
