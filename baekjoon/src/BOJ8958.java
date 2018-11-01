import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < n; tc++) {
            char[] input = br.readLine().toCharArray();
            int score = 1;
            int answer = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == 'X') {
                    score = 1;
                }
                else if (input[i] == 'O') {
                    answer += score;
                    score++;
                }
            }
            System.out.println(answer);
        }
    }
}
