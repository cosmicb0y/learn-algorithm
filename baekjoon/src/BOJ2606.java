import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        boolean[][] map = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = true;
            map[y][x] = true;
        }

        Queue<Integer> cQueue = new LinkedList<>();
        cQueue.offer(1);
        visited[1] = true;

        int count = 0;
        while(!cQueue.isEmpty()) {
            int com = cQueue.poll();
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && map[com][i]) {
                    visited[i] = true;
                    count++;
                    cQueue.offer(i);
                }
            }
        }

        System.out.println(count);
    }
}
