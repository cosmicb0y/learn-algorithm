import java.util.Scanner;

public class BOJ14503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int robotX = sc.nextInt();
        int robotY = sc.nextInt();

        int dir = sc.nextInt();

        int[] xDir = new int[]{-1, 0, 1, 0};
        int[] yDir = new int[]{0, 1, 0, -1};

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        while (true) {
            if (map[robotX][robotY] == 0) {
                map[robotX][robotY] = 2;
            }

            boolean allBlock = false;
            for (int i = 0; i < 4; i++) {
                dir = (dir + 3) % 4;
                if (map[robotX + xDir[dir]][robotY + yDir[dir]] == 0) {
                    break;
                }
                else if (i == 3 && map[robotX + xDir[dir]][robotY + yDir[dir]] > 0) {
                    allBlock = true;
                }
            }

            if (!allBlock) {
                robotX += xDir[dir];
                robotY += yDir[dir];
                continue;
            }

            dir = (dir + 2) % 4;
            if (map[robotX + xDir[dir]][robotY + yDir[dir]] == 1) {
                break;
            }
            robotX += xDir[dir];
            robotY += yDir[dir];

            dir = (dir + 2) % 4;
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    answer++;
                }
            }
        }

        System.out.println(answer);


    }
}
