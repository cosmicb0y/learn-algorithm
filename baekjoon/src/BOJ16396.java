import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16396 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] line = new int[10000];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                if (line[j] == 0) {
                    answer++;
                    line[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
