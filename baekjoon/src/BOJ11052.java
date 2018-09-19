import java.util.Scanner;

public class BOJ11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] DP = new int[n + 1];

        int[] price = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            price[i] = sc.nextInt();
            DP[i] = price[i];
        }

        for (int i = 2; i <= n; i++) {
            int half = (int)Math.ceil((double)i / 2);
            for (int j = 1; j <= half; j++) {
                DP[i] = Math.max(DP[i], DP[j] + DP[i - j]);
            }
        }

        System.out.println(DP[n]);
    }
}
