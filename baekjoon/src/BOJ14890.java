import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14890 {
    static int n;
    static int l;
    static int[][] map;
    static boolean[][] visited;
    static boolean[][] visited2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        map = new int[n + 2][n + 2];
        visited = new boolean[n + 2][n + 2];
        visited2 = new boolean[n + 2][n + 2];

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

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                if (map[i][j] - map[i][j + 1] == 1) {
                    boolean canDo = true;
                    int height = map[i][j + 1];
                    if (l + j > n) break;
                    for (int k = j + 1; k <= l + j; k++) {
                        if (map[i][k] != height || visited[i][k]) {
                            canDo = false;
                            break;
                        }
                    }
                    if (canDo) {
                        int nextIndex = Math.min(l + j + 1, n);
                        if (map[i][nextIndex] > height) break;
                        for (int k = j + 1; k <= l + j; k++) {
                            visited[i][k] = true;
                        }
                    } else {
                        break;
                    }
                }
                if (map[i][j] - map[i][j + 1] == -1) {
                    boolean canDo = true;
                    int height = map[i][j];
                    if (j - l < 0) break;
                    for (int k = j; k > j - l; k--) {
                        if (map[i][k] != height || visited[i][k]) {
                            canDo = false;
                            break;
                        }
                    }
                    if (canDo) {
                        int nextIndex = Math.max(j - l, 1);
                        if (map[i][nextIndex] > height) break;
                        for (int k = j; k > j - l; k--) {
                            visited[i][k] = true;
                        }
                    }
                    else {
                        break;
                    }
                }
                if (Math.abs(map[i][j] - map[i][j + 1]) > 1) break;
                if (j == n - 1) {
                    //System.out.println("hori: " + i);
                    count++;
                }
            }
        }

        //System.out.println(count);

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i < n; i++) {
                if (map[i][j] - map[i + 1][j] == 1) {
                    boolean canDo = true;
                    int height = map[i + 1][j];
                    if (l + i > n) break;
                    for (int k = i + 1; k <= l + i; k++) {
                        if (map[k][j] != height || visited2[k][j]) {
                            canDo = false;
                            break;
                        }
                    }
                    if (canDo) {
                        int nextIndex = l + i + 1;
                        if (map[nextIndex][j] > map[i + 1][j]) break;

                        for (int k = i + 1; k <= l + i; k++) {
                            visited2[k][j] = true;
                        }
                    } else {
                        break;
                    }
                }
                if (map[i][j] - map[i + 1][j] == -1) {
                    boolean canDo = true;
                    int height = map[i][j];
                    if (i - l < 0) break;
                    for (int k = i; k > i - l; k--) {
                        if (map[k][j] != height || visited2[k][j]) {
                            canDo = false;
                            break;
                        }
                    }
                    if (canDo) {
                        int nextIndex = Math.max(i - l, 1);
                        if (map[nextIndex][j] > height) break;
                        for (int k = i; k > i - l; k--) {
                            visited2[k][j] = true;
                        }
                    }
                    else {
                        break;
                    }
                }
                if (Math.abs(map[i][j] - map[i + 1][j]) > 1) break;
                if (i == n - 1) {
                    //System.out.println("verti: " + j);
                    count++;
                }
            }
        }


        System.out.println(count);
    }

}

