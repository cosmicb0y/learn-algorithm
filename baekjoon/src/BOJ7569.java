import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ7569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[][][] map = new int[h + 2][n + 2][m + 2];


        for (int i = 0; i <= h + 1; i++) {
            for (int j = 0; j <= n + 1; j++) {
                Arrays.fill(map[i][j], -1);
            }
        }

        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();
        Queue<Integer> zQueue = new LinkedList<>();

        int count = 0;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    map[i][j][k] = sc.nextInt();
                    if (map[i][j][k] > 0) {
                        xQueue.add(i);
                        yQueue.add(j);
                        zQueue.add(k);
                    }
                    if (map[i][j][k] == 0) {
                        count++;
                    }
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
                int z = zQueue.remove();

                if (map[x][y - 1][z] == 0) {
                    xQueue.add(x);
                    yQueue.add(y - 1);
                    zQueue.add(z);
                    map[x][y - 1][z] = 1;
                    count--;
                }

                if (map[x][y + 1][z] == 0) {
                    xQueue.add(x);
                    yQueue.add(y + 1);
                    zQueue.add(z);
                    map[x][y + 1][z] = 1;
                    count--;
                }

                if (map[x - 1][y][z] == 0) {
                    xQueue.add(x - 1);
                    yQueue.add(y);
                    zQueue.add(z);
                    map[x - 1][y][z] = 1;
                    count--;
                }

                if (map[x + 1][y][z] == 0) {
                    xQueue.add(x + 1);
                    yQueue.add(y);
                    zQueue.add(z);
                    map[x + 1][y][z] = 1;
                    count--;
                }

                if (map[x][y][z + 1] == 0) {
                    xQueue.add(x);
                    yQueue.add(y);
                    zQueue.add(z + 1);
                    map[x][y][z + 1] = 1;
                    count--;
                }

                if (map[x][y][z - 1] == 0) {
                    xQueue.add(x);
                    yQueue.add(y);
                    zQueue.add(z - 1);
                    map[x][y][z - 1] = 1;
                    count--;
                }



            }

        }
    }
}
