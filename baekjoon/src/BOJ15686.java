import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15686 {
    static int n;
    static int m;
    static int homeX[] = new int[2501];
    static int homeY[] = new int[2501];
    static int homeIndex = 0;
    static int chickenX[] = new int[14];
    static int chickenY[] = new int[14];
    static int chickenIndex = 0;
    static boolean selected[] = new boolean[14];
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) {
                    homeX[homeIndex] = i;
                    homeY[homeIndex] = j;
                    homeIndex++;
                }
                if (num == 2) {
                    chickenX[chickenIndex] = i;
                    chickenY[chickenIndex] = j;
                    chickenIndex++;
                }
            }
        }

        for (int i = 0; i <= chickenIndex - m; i++) {
            selected[i] = true;
            dfs(i, 1);
            selected[i] = false;
        }


        System.out.println(answer);

    }

    private static void dfs(int index, int len) {
        if (len == m) {
            int sum = 0;
            for (int i = 0; i < homeIndex; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < chickenIndex; j++) {
                    if (selected[j]) {
                        min = Math.min(min, distance(homeX[i], homeY[i], chickenX[j], chickenY[j]));
                    }
                }
                sum += min;
            }
            answer = Math.min(answer, sum);
            return;
        }

        for (int i = index + 1; i <= chickenIndex - m + len + 1; i++) {
            selected[i] = true;
            dfs(i, len + 1);
            selected[i] = false;
        }
    }

    private static int distance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
