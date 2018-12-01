import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {
    static int[] height = new int[9];
    static int sum = 0;
    static boolean[] visited = new boolean[9];
    static boolean end = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(height);

        for (int i = 0; i < 3; i++) {
            visited[i] = true;
            sum += height[i];
            dfs(i, 1);
            sum -= height[i];
            visited[i] = false;
        }

    }

    private static void dfs(int cur, int length) {
        if (end) return;
        if (length == 7) {
            if (sum == 100) {
                for (int i = 0; i < 9; i++) {
                    if (visited[i]) System.out.println(height[i]);
                }
                end = true;
            }
            return;
        }

        for (int i = cur + 1; i < 9; i++) {
            visited[i] = true;
            sum += height[i];
            dfs(i, length + 1);
            sum -= height[i];
            visited[i] = false;
        }


    }
}
