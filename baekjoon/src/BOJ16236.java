import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16236 {
    static int n;
    static int map[][];
    static int sharkX;
    static int sharkY;
    static int sharkNum = 2;
    static int sharkEat = 0;
    static int xDir[] = new int[]{-1, 0, 1, 0};
    static int yDir[] = new int[]{0, 1, 0, -1};
    static int minute = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                    map[i][j] = 0;
                }
            }
        }

        while (true) {
            int shortest = Integer.MAX_VALUE - 1;
            int fishX = n;
            int fishY = n;
            boolean canEat = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > 0 && map[i][j] < sharkNum) {
                        int d = distance(sharkX, sharkY, i, j);
                        if (d < shortest) {
                            shortest = d;
                            fishX = i;
                            fishY = j;
                            canEat = true;
                        }
                        if (d == shortest && i < fishX) {
                            fishX = i;
                            fishY = j;
                        }

                    }
                }
            }

            if (canEat) {
                map[fishX][fishY] = 0;
                sharkX = fishX;
                sharkY = fishY;
                minute += shortest;
                sharkEat++;
                if (sharkEat == sharkNum) {
                    sharkEat = 0;
                    sharkNum++;
                }
            } else {
                System.out.println(minute);
                break;
            }
        }

    }

    private static int distance(int x1, int y1, int x2, int y2) {
        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();
        Queue<Integer> lQueue = new LinkedList<>();

        xQueue.offer(x1);
        yQueue.offer(y1);
        lQueue.offer(0);

        int len = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[n][n];

        while (!xQueue.isEmpty()) {
            int x = xQueue.poll();
            int y = yQueue.poll();
            int l = lQueue.poll();

            if (x == x2 && y == y2) {
                len = l;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = x + xDir[i];
                int nextY = y + yDir[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                    if (!visited[nextX][nextY] && map[nextX][nextY] <= sharkNum) {
                        visited[nextX][nextY] = true;
                        xQueue.offer(nextX);
                        yQueue.offer(nextY);
                        lQueue.offer(l + 1);
                    }
                }
            }


        }
        return len;
    }
}
