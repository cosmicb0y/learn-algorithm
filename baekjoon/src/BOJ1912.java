import java.util.Scanner;

public class BOJ1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        int[] DP = new int[num];

        DP[0] = input[0];
        int answer = input[0];

        for (int i = 1; i < num; i++) {
            DP[i] = Math.max(input[i], input[i] + DP[i - 1]);
            answer = Math.max(answer, DP[i]);
        }

        System.out.println(answer);
    }
}
