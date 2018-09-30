import java.util.Arrays;
import java.util.Scanner;

public class BOJ2315 {
    static int n;
    static int m;
    static int[][] light;
    static int[][][] DP;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        light = new int[n + 1][3];
        DP = new int[n + 1][n + 1][2];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(DP[i][j], -1);
            }
        }


        for (int i = 1; i <= n; i ++) {
            light[i][0] = sc.nextInt();
            light[i][1] = sc.nextInt();
            light[i][2] = light[i - 1][2] + light[i][1];
        }

        System.out.println(minWaste(m, m, 0));

    }

    private static int minWaste(int left, int right, int where) {
        if (left == 1 && right == n) {
            return 0;
        }

        if (DP[left][right][where] !=  -1) {
            return DP[left][right][where];
        }

        int min = Integer.MAX_VALUE;

        int now;
        if (where == 0) {
            now = left;
        }
        else {
            now = right;
        }

        if (left - 1 >= 1) {
            min = Math.min(min, minWaste(left - 1, right, 0) + (light[now][0] - light[left - 1][0]) * (light[n][2] - light[right][2] + light[left - 1][2]));
        }

        if (right + 1 <= n) {
            min = Math.min(min, minWaste(left, right + 1, 1) + (light[right + 1][0]  - light[now][0]) * (light[n][2] - light[right][2] + light[left - 1][2]));
        }

        DP[left][right][where] = min;

        return min;
    }
}
