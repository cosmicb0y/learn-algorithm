import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 2][m + 2];
        visited = new boolean[n + 2][m + 2];

        for (int i = 1; i <= n; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 1; j <= m; j++) {
                map[i][j] = input[j - 1] - '0';
            }
        }

        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();
        Queue<Integer> lQueue = new LinkedList<>();

        visited[1][1] = true;
        xQueue.offer(1);
        yQueue.offer(1);
        lQueue.offer(1);

        while (!xQueue.isEmpty()) {
            int curX = xQueue.poll();
            int curY = yQueue.poll();
            int len = lQueue.poll();

            if (curX == n && curY == m) {
                System.out.println(len);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = curX + xDir[i];
                int nextY = curY + yDir[i];

                if (map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    xQueue.offer(nextX);
                    yQueue.offer(nextY);
                    lQueue.offer(len + 1);
                    visited[nextX][nextY] = true;
                }
            }

        }

    }
}
