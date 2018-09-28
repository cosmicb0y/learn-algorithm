import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ13460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] map = new char[n][m];
        boolean[][][][] visited = new boolean[n][m][n][m];

        int[] xDir = new int[]{-1, 0, 1, 0};
        int[] yDir = new int[]{0, 1, 0, -1};

        Queue<Point> pointQueue = new LinkedList<>();

        int redX = 0;
        int redY = 0;
        int blueX = 0;
        int blueY = 0;

        for (int i = 0; i < n; i++) {
            String mapStr = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = mapStr.charAt(j);
                if (map[i][j] == 'R') {
                    map[i][j] = '.';
                    redX = i;
                    redY = j;
                } else if (map[i][j] == 'B') {
                    map[i][j] = '.';
                    blueX = i;
                    blueY = j;
                }
            }
        }

        pointQueue.offer(new Point(redX, redY, blueX, blueY, 0));
        visited[redX][redY][blueX][blueY] = true;

        while (!pointQueue.isEmpty()) {
            Point point = pointQueue.poll();
            if (point.move > 9) break;


            for (int i = 0; i < 4; i++) {
                redX = point.redX;
                redY = point.redY;
                blueX = point.blueX;
                blueY = point.blueY;
                int move = point.move;
                boolean inHole = false;
                while (map[redX + xDir[i]][redY + yDir[i]] != '#') {
                    if (map[redX + xDir[i]][redY + yDir[i]] == 'O') {
                        inHole = true;
                        break;
                    }
                    redX += xDir[i];
                    redY += yDir[i];
                }
                boolean bluehole = false;
                while (map[blueX + xDir[i]][blueY + yDir[i]] != '#') {
                    if (map[blueX + xDir[i]][blueY + yDir[i]] == 'O') {
                        bluehole = true;
                    }
                    blueX += xDir[i];
                    blueY += yDir[i];
                }

                if (!bluehole) {
                    if (inHole) {
                        System.out.println(move + 1);
                        return;
                    }
                    if (redX == blueX && redY == blueY) {
                        switch (i) {
                            case 0:
                                if (point.redX > point.blueX) {
                                    redX = blueX + 1;
                                } else {
                                    blueX = redX + 1;
                                }
                                break;
                            case 1:
                                if (point.redY > point.blueY) {
                                    blueY = redY - 1;
                                } else {
                                    redY = blueY - 1;
                                }
                                break;
                            case 2:
                                if (point.redX > point.blueX) {
                                    blueX = redX - 1;
                                } else {
                                    redX = blueX - 1;
                                }
                                break;
                            case 3:
                                if (point.redY > point.blueY) {
                                    redY = blueY + 1;
                                } else {
                                    blueY = redY + 1;
                                }
                                break;
                        }
                    }
                    if (visited[redX][redY][blueX][blueY]) continue;
                    visited[redX][redY][blueX][blueY] = true;
                    pointQueue.offer(new Point(redX, redY, blueX, blueY, move + 1));
                }

            }
        }

        System.out.println(-1);

    }

    static class Point {
        int redX;
        int redY;
        int blueX;
        int blueY;
        int move;

        public Point(int redX, int redY, int blueX, int blueY, int move) {
            this.redX = redX;
            this.redY = redY;
            this.blueX = blueX;
            this.blueY = blueY;
            this.move = move;
        }
    }
}
