public class PROG42899 {
    public static void main(String[] args) {
        int K = 1650;
        int[][] travel = new int[][]{{500, 200, 200, 100}, {800, 370, 300, 120}, {700, 250, 300, 90}};

        int answer = solution(K, travel);

        System.out.println(answer);
    }

    public static int solution(int K, int[][] travel) {
        int answer = 0;
        int n = travel.length;
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
                    DP[i + 1][j + w] = max(DP[i + 1][j + w], DP[i][j] + wc);
                    visited[i + 1][j + w] = true;
                }
                if (j + b <= K) {
                    DP[i + 1][j + b] = max(DP[i + 1][j + b], DP[i][j] + bc);
                    visited[i + 1][j + b] = true;
                }
            }
        }

        for (int i = 0; i <= K; i++) {
            answer = Math.max(answer, DP[n][i]);
        }

        return answer;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
