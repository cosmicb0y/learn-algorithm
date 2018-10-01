import java.util.Arrays;
import java.util.Scanner;

public class BOJ3190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] map = new int[n + 2][n + 2];


        Arrays.fill(map[0], -1);
        for (int i = 1; i <= n; i++) {
            map[i][0] = -1;
            map[i][n + 1] = -1;
        }
        Arrays.fill(map[n + 1], -1);

        for (int i = 0; i < k; i++) {
            map[sc.nextInt()][sc.nextInt()] = 1;
        }

        int l = sc.nextInt();
        int[] move = new int[10001];

        for (int i = 1; i <= l; i++) {
            int Index = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'L') {
                move[Index] = 3;
            } else {
                move[Index] = 1;
            }
        }

        int[] xDir = new int[]{-1, 0, 1, 0};
        int[] yDir = new int[]{0, 1, 0, -1};
        int dir = 1;
        int tailDir = 1;

        int curX = 1;
        int curY = 1;
        int tailX = 1;
        int tailY = 1;
        int tailSec = 0;

        map[1][1] = 2;

        while (true) {
            for (int i = 1; i <= 10000; i++) {
                boolean eat = false;
                switch (map[curX + xDir[dir]][curY + yDir[dir]]) {
                    case -1:
                        System.out.println(i);
                        return;
                    case 0:
                        map[curX + xDir[dir]][curY + yDir[dir]] = 2;
                        break;
                    case 1:
                        map[curX + xDir[dir]][curY + yDir[dir]] = 2;
                        eat = true;
                        break;
                    case 2:
                        System.out.println(i);
                        return;
                }
                curX += xDir[dir];
                curY += yDir[dir];
                dir = (dir + move[i]) % 4;

                if (!eat) {
                    map[tailX][tailY] = 0;
                    tailX += xDir[tailDir];
                    tailY += yDir[tailDir];
                    tailDir = (tailDir + move[i - tailSec]) % 4;
                }
                else {
                    tailSec++;
                }
            }
        }


    }
}
