import java.math.BigInteger;
import java.util.Scanner;

public class BOJ9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        BigInteger[] DP = new BigInteger[101];

        DP[1] = BigInteger.ONE;
        DP[2] = BigInteger.ONE;
        DP[3] = BigInteger.ONE;

        for (int i = 4; i <= 100; i++) {
            DP[i] = DP[i - 2].add(DP[i - 3]);
        }

        for (int i = 0; i < total; i++) {
            System.out.println(DP[sc.nextInt()]);
        }
    }
}
