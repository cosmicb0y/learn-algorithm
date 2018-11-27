import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 3 || n == 6) {
            System.out.println(0);
            return;
        }

        int[] DP = new int[1001];

        for (int i = 1; i < 999; i++) {
            DP[i + 2] = DP[i + 1] + i;
        }

        System.out.println(DP[n / 3]);
    }
}
