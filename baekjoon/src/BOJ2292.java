import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long[] DP = new long[100000];

        DP[0] = 1;
        DP[1] = 2;

        long factor = 6;
        int room = 1;
        for (int i = 2; DP[i - 1] <= n; i++) {
            DP[i] = DP[i - 1] + factor;
            factor += 6;
            room = i;
        }

        System.out.println(room);
    }
}
