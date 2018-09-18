import java.util.Scanner;

public class BOJ2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }

        int[][] DP = new int[num][3];

        DP[0][0] = 0;
        DP[0][1] = input[0];
        DP[0][2] = input[0];

        DP[1][0] = input[0];
        DP[1][1] = input[1];
        DP[1][2] = input[0] + input[1];

        for (int i = 2; i < num; i++) {
            DP[i][0] = Math.max(Math.max(DP[i - 1][0], DP[i - 1][1]), DP[i - 1][2]);
            DP[i][1] = Math.max(DP[i - 2][1], DP[i - 2][2]) + input[i];
            DP[i][2] = DP[i - 1][1] + input[i];
        }

        System.out.println(Math.max(DP[num - 1][1], DP[num - 1][2]));
    }
}
