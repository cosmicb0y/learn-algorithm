import java.util.Scanner;

public class BOJ1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] DP = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (DP[i] > DP[i - j * j] + 1 || DP[i] == 0) {
                    DP[i] = DP[i - j * j] + 1;
                }
            }
        }

        System.out.println(DP[num]);
    }
}
