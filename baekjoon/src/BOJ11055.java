import java.util.Arrays;
import java.util.Scanner;

public class BOJ11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        int[] DP = new int[num];
        int[] DP2 = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
            DP2[i] = input[i];
        }

        DP[0] = 1;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i] > input[j] && DP[i] < DP[j] + 1 && DP2[i] < DP2[j] + input[i]) {
                    DP[i] = DP[j] + 1;
                    DP2[i] = DP2[j] + input[i];
                }
            }
            if (DP[i] == 0) {
                DP[i] = 1;
            }
        }

        Arrays.sort(DP2);
        System.out.println(DP2[num - 1]);
    }
}
