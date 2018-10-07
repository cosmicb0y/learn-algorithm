public class PROG12952 {
    static int[][] map;
    static int num;
    static boolean[] visited;
    static boolean[][] visited2;
    static int answer = 0;
    public static void main(String[] args) {
        int n = 4;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n) {
        map = new int[n][n];
        num = n;

        for (int i = 0; i < n; i++) {
            visited = new boolean[n];
            visited2 = new boolean[n][n];
            visited[i] = true;
            visited2[0][i] = true;
            dfs(0, i, 1);
        }

        return answer;
    }

    static void dfs(int x, int y, int length) {
        if (length == num) {
            answer++;
        }
        else {
            for (int i = 0; i < num; i++) {
                if (!visited[i]) {
                    boolean canDo = true;
                    for (int j = 0; j <= x; j++) {
                        for (int k = 0; k < num; k++) {
                            if (visited2[j][k] && (Math.abs(j - x - 1) == Math.abs(k - i))) {
                                canDo = false;
                            }
                        }
                    }
                    if (canDo) {
                        visited2[x + 1][i] = true;
                        visited[i] = true;
                        dfs(x + 1, i, length + 1);
                    }
                }
            }
        }

        visited[y] = false;
        visited2[x][y] = false;
    }
}
