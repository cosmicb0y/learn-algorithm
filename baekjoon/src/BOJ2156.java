import java.util.Scanner;

public class BOJ2156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] inputArray = new int[num];
        int[][] DP = new int[3][num];

        for (int i = 0; i < num; i++) {
            inputArray[i] = scanner.nextInt();
        }

        DP[0][0] = 0;
        DP[1][0] = inputArray[0];
        DP[2][0] = inputArray[0];

        for (int i = 1; i < num; i++) {
            DP[0][i] = Math.max(Math.max(DP[1][i - 1], DP[2][i - 1]), DP[0][i - 1]);
            DP[1][i] = DP[0][i - 1] + inputArray[i];
            DP[2][i] = DP[1][i - 1] + inputArray[i];
        }

        System.out.println(Math.max(Math.max(DP[0][num - 1], DP[1][num - 1]), DP[2][num - 1]));

    }
}
