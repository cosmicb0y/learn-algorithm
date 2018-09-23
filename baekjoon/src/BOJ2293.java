import java.util.Scanner;

public class BOJ2293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int[] DP = new int[k + 1];

        DP[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= k; j++) {
                    DP[j] += DP[j - coins[i]];
            }
        }

        System.out.println(DP[k]);
    }
}
