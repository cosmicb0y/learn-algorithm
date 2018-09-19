import java.util.Scanner;

public class BOJ2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mod = 1000000;
        String numStr = sc.next();
        int n = numStr.length();

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = numStr.charAt(i) - '0';
        }

        long[] DP = new long[n + 1];

        if (input[n - 1] > 0) {
            DP[n - 1] = 1;
        }

        if (n >= 2 && input[n - 2] > 0 && input[n - 2] * 10 + input[n - 1] > 1 && input[n - 2] * 10 + input[n - 1] <= 26) {
            DP[n - 2] = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (input[i] != 0) {
                DP[i] = (DP[i] + DP[i + 1]) % mod;
                int twodig = input[i] * 10 + input[i + 1];
                if (twodig >= 1 && twodig <= 26) {
                    DP[i] = (DP[i] + DP[i + 2]) % mod;
                }
            }

        }

        System.out.println(DP[0]);
    }
}
