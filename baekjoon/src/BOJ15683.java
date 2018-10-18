import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15683 {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] cctvX = new int[8];
    static int[] cctvY = new int[8];
    static int[] cctvDir = new int[8];
    static int[] cctvType = new int[8];
    static int cctvNum = 0;
    static int dead;
    static int wall = 0;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 2][m + 2];
        dead = n * m;

        Arrays.fill(map[0], 6);
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = 6;
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > 0 && map[i][j] < 6) {
                    cctvX[cctvNum] = i;
                    cctvY[cctvNum] = j;
                    cctvType[cctvNum] = map[i][j];
                    cctvNum++;
                }
                if (map[i][j] == 6) {
                    wall++;
                }
            }
            map[i][m + 1] = 6;
        }
        Arrays.fill(map[n + 1], 6);


        for (int i = 0; i < 4; i++) {
            dfs(0, i);
        }


        System.out.println(dead);
    }

    private static void dfs(int cameraIndex, int dir) {
        if (cameraIndex == cctvNum) {
            visited = new boolean[n + 2][m + 2];
            int sum = n * m - cctvNum - wall;
            for (int i = 0; i < cctvNum; i++) {
                int nextX = cctvX[i] + xDir[cctvDir[i]];
                int nextY = cctvY[i] + yDir[cctvDir[i]];

                while (map[nextX][nextY] < 6) {
                    if (!visited[nextX][nextY] && map[nextX][nextY] == 0) {
                        visited[nextX][nextY] = true;
                        sum--;
                    }
                    nextX += xDir[cctvDir[i]];
                    nextY += yDir[cctvDir[i]];
                }

                if (cctvType[i] == 2 || cctvType[i] == 4 || cctvType[i] == 5) {
                    nextX = cctvX[i] + xDir[(cctvDir[i] + 2) % 4];
                    nextY = cctvY[i] + yDir[(cctvDir[i] + 2) % 4];

                    while (map[nextX][nextY] < 6) {
                        if (!visited[nextX][nextY] && map[nextX][nextY] == 0) {
                            visited[nextX][nextY] = true;
                            sum--;
                        }
                        nextX += xDir[(cctvDir[i] + 2) % 4];
                        nextY += yDir[(cctvDir[i] + 2) % 4];
                    }
                }

                if (cctvType[i] == 3 || cctvType[i] == 4 || cctvType[i] == 5) {
                    nextX = cctvX[i] + xDir[(cctvDir[i] + 3) % 4];
                    nextY = cctvY[i] + yDir[(cctvDir[i] + 3) % 4];

                    while (map[nextX][nextY] < 6) {
                        if (!visited[nextX][nextY] && map[nextX][nextY] == 0) {
                            visited[nextX][nextY] = true;
                            sum--;
                        }
                        nextX += xDir[(cctvDir[i] + 3) % 4];
                        nextY += yDir[(cctvDir[i] + 3) % 4];
                    }
                }

                if (cctvType[i] == 5) {
                    nextX = cctvX[i] + xDir[(cctvDir[i] + 1) % 4];
                    nextY = cctvY[i] + yDir[(cctvDir[i] + 1) % 4];

                    while (map[nextX][nextY] < 6) {
                        if (!visited[nextX][nextY] && map[nextX][nextY] == 0) {
                            visited[nextX][nextY] = true;
                            sum--;
                        }
                        nextX += xDir[(cctvDir[i] + 1) % 4];
                        nextY += yDir[(cctvDir[i] + 1) % 4];
                    }
                }

            }
            //System.out.println(sum);
            dead = Math.min(dead, sum);
            return;
        }

        cctvDir[cameraIndex] = dir;
        for (int i = 0; i < 4; i++) {
            dfs(cameraIndex + 1, i);
        }
    }
}
