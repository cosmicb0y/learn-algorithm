import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(st.nextToken()) + 1;
        int y = Integer.parseInt(st.nextToken()) + 1;

        int k = Integer.parseInt(st.nextToken());

        int[][] map = new int[n + 2][m + 2];

        int[] xDir = new int[]{0, 0, 0, -1, 1};
        int[] yDir = new int[]{0, 1, -1, 0, 0};

        Arrays.fill(map[0], -1);
        for (int i = 1; i <= n; i++) {
            map[i][0] = -1;
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
            map[i][m + 1] = -1;
        }
        Arrays.fill(map[n + 1], -1);

        int[] dice = new int[7];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int nextDir = Integer.parseInt(st.nextToken());
            int nextX = x + xDir[nextDir];
            int nextY = y + yDir[nextDir];

            if (map[nextX][nextY] == -1) continue;

            x = nextX;
            y = nextY;

            int temp = dice[1];
            switch (nextDir) {
                case 1:
                    dice[1] = dice[3];
                    dice[3] = dice[6];
                    dice[6] = dice[4];
                    dice[4] = temp;
                    break;
                case 2:
                    dice[1] = dice[4];
                    dice[4] = dice[6];
                    dice[6] = dice[3];
                    dice[3] = temp;
                    break;
                case 3:
                    dice[1] = dice[2];
                    dice[2] = dice[6];
                    dice[6] = dice[5];
                    dice[5] = temp;
                    break;
                case 4:
                    dice[1] = dice[5];
                    dice[5] = dice[6];
                    dice[6] = dice[2];
                    dice[2] = temp;
                    break;
            }

            if (map[x][y] == 0) {
                map[x][y] = dice[1];
            }
            else {
                dice[1] = map[x][y];
                map[x][y] = 0;
            }

            System.out.println(dice[6]);

        }
    }
}
