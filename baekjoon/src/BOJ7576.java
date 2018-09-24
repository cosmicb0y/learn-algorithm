import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ7576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] map = new int[n + 2][m + 2];

        for (int i = 0; i <= n + 1; i++) {
            Arrays.fill(map[i], -1);
        }

        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] > 0) {
                    xQueue.add(i);
                    yQueue.add(j);
                }
                if (map[i][j] == 0) {
                    count++;
                }
            }
        }

        int day = 0;
        while (true) {
            if (count == 0) {
                System.out.println(day);
                return;
            }

            if (count > 0 && xQueue.isEmpty()) {
                System.out.println(-1);
                return;
            }

            day++;

            int queueSize = xQueue.size();
            for (int i = 0; i < queueSize; i++) {
                int x = xQueue.remove();
                int y = yQueue.remove();

                if (map[x][y - 1] == 0) {
                    xQueue.add(x);
                    yQueue.add(y - 1);
                    map[x][y - 1] = 1;
                    count--;
                }

                if (map[x][y + 1] == 0) {
                    xQueue.add(x);
                    yQueue.add(y + 1);
                    map[x][y + 1] = 1;
                    count--;
                }

                if (map[x - 1][y] == 0) {
                    xQueue.add(x - 1);
                    yQueue.add(y);
                    map[x - 1][y] = 1;
                    count--;
                }

                if (map[x + 1][y] == 0) {
                    xQueue.add(x + 1);
                    yQueue.add(y);
                    map[x + 1][y] = 1;
                    count--;
                }
            }

        }
    }
}
