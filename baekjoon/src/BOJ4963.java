import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ4963 {
    static int w;
    static int h;
    static int map[][];
    static boolean visted[][];
    static int answer;
    static int xDir[] = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
    static int yDir[] = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];
            visted = new boolean[h][w];
            answer = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] > 0 && !visted[i][j]) {
                        Queue<Integer> xQueue = new LinkedList<>();
                        Queue<Integer> yQueue = new LinkedList<>();
                        xQueue.offer(i);
                        yQueue.offer(j);
                        visted[i][j] = true;

                        while (!xQueue.isEmpty()) {
                            int x = xQueue.poll();
                            int y = yQueue.poll();

                            for (int k = 0; k < 8; k++) {
                                int nextX = x + xDir[k];
                                int nextY = y + yDir[k];

                                if (nextX >= 0 && nextX < h && nextY >= 0 && nextY < w) {
                                    if (map[nextX][nextY] > 0 && !visted[nextX][nextY]) {
                                        xQueue.offer(nextX);
                                        yQueue.offer(nextY);
                                        visted[nextX][nextY] = true;
                                    }
                                }
                            }
                        }
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
