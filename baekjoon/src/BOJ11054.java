import java.util.Scanner;

public class BOJ11054 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }

        int[][] DP = new int[num][2];

        int answer = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i] > input[j]) {
                    DP[i][0] = Math.max(DP[i][0], DP[j][0]);
                }
                else if (input[i] < input[j]) {
                    DP[i][1] = Math.max(DP[i][1], Math.max(DP[j][0], DP[j][1]));
                }
            }
            DP[i][0] += 1;
            DP[i][1] += 1;

            answer = Math.max(answer, Math.max(DP[i][0], DP[i][1]));
        }

        System.out.println(answer);

    }
}
