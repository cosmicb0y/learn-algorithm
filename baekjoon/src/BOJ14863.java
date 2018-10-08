import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int n = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] travel = new int[n][4];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                travel[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] DP = new int[101][100001];
        boolean[][] visited = new boolean[101][100001];

        visited[0][0] = true;

        for (int i = 0; i < n; i++) {
            int w = travel[i][0];
            int wc = travel[i][1];
            int b = travel[i][2];
            int bc = travel[i][3];

            for (int j = 0; j <= K; j++) {
                if (!visited[i][j]) continue;
                if (j + w <= K) {
                    DP[i + 1][j + w] = Math.max(DP[i + 1][j + w], DP[i][j] + wc);
                    visited[i + 1][j + w] = true;
                }
                if (j + b <= K) {
                    DP[i + 1][j + b] = Math.max(DP[i + 1][j + b], DP[i][j] + bc);
                    visited[i + 1][j + b] = true;
                }
            }
        }

        for (int i = 0; i <= K; i++) {
            answer = Math.max(answer, DP[n][i]);
        }

        System.out.println(answer);

    }
}
