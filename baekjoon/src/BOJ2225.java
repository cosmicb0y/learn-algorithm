import java.util.Arrays;
import java.util.Scanner;

public class BOJ2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000000;

        int[][] DP = new int[n + 1][k + 1];

        Arrays.fill(DP[0], 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                DP[i][j] = (DP[i - 1][j] % mod + DP[i][j - 1] % mod) % mod;
            }
        }

        System.out.println(DP[n][k]);

    }
}
