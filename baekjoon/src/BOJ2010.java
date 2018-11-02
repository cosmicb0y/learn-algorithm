import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(br.readLine());
        }

        total -= n - 1;

        System.out.println(total);
    }
}
