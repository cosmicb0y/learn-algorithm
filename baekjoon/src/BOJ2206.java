import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2206 {
    static int min = Integer.MAX_VALUE;
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static boolean[][] breaked;
    static int[] xDir = new int[]{-1, 0, 1, 0};
    static int[] yDir = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 2][m + 2];
        visited = new boolean[n + 2][m + 2];
        breaked = new boolean[n + 2][m + 2];

        Arrays.fill(map[0], -1);
        for (int i = 1; i <= n; i++) {
            map[i][0] = -1;
            char[] input = br.readLine().toCharArray();
            for (int j = 1; j <= m; j++) {
                map[i][j] = input[j - 1] - '0';
            }
            map[i][m + 1] = -1;
        }
        Arrays.fill(map[n + 1], -1);


        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();
        Queue<Integer> lQueue = new LinkedList<>();
        Queue<Boolean> bQueue = new LinkedList<>();

        xQueue.offer(1);
        yQueue.offer(1);
        lQueue.offer(1);
        bQueue.offer(false);

        while (!xQueue.isEmpty()) {
            int curX = xQueue.poll();
            int curY = yQueue.poll();
            int length = lQueue.poll();
            boolean hasBreak = bQueue.poll();

            if (curX == n && curY == m) {
                min = Math.min(min, length);
                continue;
            }

            if (!hasBreak && !visited[curX][curY] || hasBreak && !breaked[curX][curY]) {
                if (hasBreak) {
                    breaked[curX][curY] = true;
                }
                else {
                    visited[curX][curY] = true;
                }

                for (int i = 0; i < 4; i++) {
                    int nextX = curX + xDir[i];
                    int nextY = curY + yDir[i];

                    if (!hasBreak) {
                        if (!visited[nextX][nextY] && map[nextX][nextY] == 0) {
                            xQueue.offer(nextX);
                            yQueue.offer(nextY);
                            lQueue.offer(length + 1);
                            bQueue.offer(false);
                        }
                        else if (!breaked[nextX][nextY] && map[nextX][nextY] == 1) {
                            xQueue.offer(nextX);
                            yQueue.offer(nextY);
                            lQueue.offer(length + 1);
                            bQueue.offer(true);
                        }
                    }
                    else {
                        if (!breaked[nextX][nextY] && map[nextX][nextY] == 0) {
                            xQueue.offer(nextX);
                            yQueue.offer(nextY);
                            lQueue.offer(length + 1);
                            bQueue.offer(true);
                        }
                    }
                }
            }

        }

        if (min == Integer.MAX_VALUE) min = -1;
        System.out.println(min);

    }
}
