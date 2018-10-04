import java.util.Arrays;
import java.util.Scanner;

public class BOJ2667 {
    static int[][] map;
    static int count = 0;
    static int index = 0;
    static int[] sizeArray;
    static boolean[][] visited;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        map = new int[n + 2][n + 2];
        visited = new boolean[n + 1][n + 1];
        sizeArray = new int[n * n];

        Arrays.fill(map[0], -1);
        for (int i = 1; i <= n; i++) {
            map[i][0] = -1;
            char[] strArray = sc.next().toCharArray();
            for (int j = 1; j <= n; j++) {
                map[i][j] = strArray[j - 1] - '0';
            }
            map[i][n + 1] = -1;
        }
        Arrays.fill(map[n + 1], -1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j, 1);
                    index++;
                }
            }
        }

        System.out.println(index);
        Arrays.sort(sizeArray);
        for (int i = n * n - index; i < n * n; i++) {
            System.out.println(sizeArray[i]);
        }

    }

    private static void dfs(int x, int y, int size) {
        if (size > sizeArray[index]) {
            sizeArray[index] = size;
        }

        if (!visited[x][y]) {
            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                if (map[x + xDir[i]][y + yDir[i]] == 1 && !visited[x + xDir[i]][y + yDir[i]]) {
                    dfs(x + xDir[i], y + yDir[i], sizeArray[index] + 1);
                }
            }
        }

    }
}
