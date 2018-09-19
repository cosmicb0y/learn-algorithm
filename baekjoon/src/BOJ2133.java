import java.util.Scanner;

public class BOJ2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] DP = new int[31];

        DP[0] = 1;
        DP[2] = 3;

        for (int i = 2; i <= num; i += 2) {
            DP[i] = 3 * DP[i - 2];
            for (int j = 4; j <= i; j += 2) {
                DP[i] += 2 * DP[i - j];
            }

        }

        System.out.println(DP[num]);
    }
}
