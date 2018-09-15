import java.util.Scanner;

public class BOJ1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        int[][] DP = new int[41][2];
        DP[0][0] = 1;
        DP[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            DP[i][0] = DP[i - 1][0] + DP[i - 2][0];
            DP[i][1] = DP[i - 1][1] + DP[i - 2][1];
        }

        for (int i = 0; i < total; i++) {
            int num = scanner.nextInt();
            System.out.println(DP[num][0] + " " + DP[num][1]);
        }

    }
}
