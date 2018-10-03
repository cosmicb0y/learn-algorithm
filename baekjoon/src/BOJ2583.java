import java.util.Arrays;
import java.util.Scanner;

public class BOJ2583 {
    static int m;
    static int n;
    static int k;
    static int[][] map;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};
    static int answer = 0;
    static int[] area;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        map = new int[m + 2][n + 2];
        area = new int[m * n];


        Arrays.fill(map[0], 1);
        for (int i = 1; i <= m; i++) {
            map[i][0] = 1;
            map[i][n + 1] = 1;
        }
        Arrays.fill(map[m + 1], 1);

        for (int i = 0; i < k; i++) {
            int leftX = sc.nextInt() + 1;
            int leftY = sc.nextInt() + 1;
            int rightX = sc.nextInt() + 1;
            int rightY = sc.nextInt() + 1;
            for (int y = leftY; y < rightY; y++) {
                for (int x = leftX; x < rightX; x++) {
                    map[y][x] = 1;
                }
            }
        }
        int index = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dfs(j, i, index)) {
                    answer++;
                    index++;
                }
            }
        }


        System.out.println(answer);
        Arrays.sort(area);
        for (int i = 0; i < index; i++) {
            System.out.print(area[m * n - index + i] + " ");
        }

    }

    private static boolean dfs(int x, int y, int index) {
        boolean canStart = false;
        if (map[y][x] == 0) {
            canStart = true;
            map[y][x] = 1;
            area[index]++;

            for (int i = 0; i < 4; i++) {
                if (map[y + yDir[i]][x + xDir[i]] == 0) {
                    dfs(x + xDir[i], y + yDir[i], index);
                }
            }
        }

        return canStart;
    }
}
