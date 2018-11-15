import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[9];

        for (int i = 1; i <= 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i <= 8; i++) {
            if (i != input[i]) {
                ascending = false;
            }
            if (9 - i != input[i]) {
                descending = false;
            }
        }


        String answer = "mixed";

        if (ascending) answer ="ascending";
        if (descending) answer = "descending";

        System.out.println(answer);
    }
}
