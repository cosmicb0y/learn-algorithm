import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] taste = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                taste[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int answer = 0;

        for (int i = 0; i < m - 2; i++) {
            for (int j = 1; j < m - 1; j++) {
                for (int k = 2; k < m; k++) {
                    int max = 0;
                    for (int l = 0; l < n; l++) {
                        max += Math.max(taste[l][i], Math.max(taste[l][j], taste[l][k]));
                    }
                    answer = Math.max(answer, max);
                }
            }

        }


        System.out.println(answer);

    }
}
