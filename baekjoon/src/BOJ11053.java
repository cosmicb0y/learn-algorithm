import java.util.Arrays;
import java.util.Scanner;

public class BOJ11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }

        int[] DP = new int[num];

        DP[0] = 1;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i] > input[j] && DP[i] < DP[j] + 1) {
                    DP[i] = DP[j] + 1;
                }
            }
            if (DP[i] == 0) {
                DP[i] = 1;
            }
        }

        Arrays.sort(DP);
        System.out.println(DP[num - 1]);
    }
}
