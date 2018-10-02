import java.util.ArrayList;
import java.util.Scanner;

public class BOJ15685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] input = new int[n][4];

        int[][] map = new int[101][101];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        int[] xDir = new int[]{1, 0, -1, 0};
        int[] yDir = new int[]{0, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> moveArray = new ArrayList<>();
            moveArray.add(input[i][2]);
            for (int j = 0; j < input[i][3]; j++) {
                for (int k = moveArray.size() - 1; k >= 0; k--) {
                    moveArray.add((moveArray.get(k) + 1) % 4);
                }
            }

            int curX = input[i][0];
            int curY = input[i][1];
            map[curY][curX] = 1;
            for (int j = 0; j < moveArray.size(); j++) {
                curX = (curX + xDir[moveArray.get(j)]);
                curY = (curY + yDir[moveArray.get(j)]);
                map[curY][curX] = 1;
            }

        }

        int answer = 0;
        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j<= 99; j++) {
                if (map[i][j] == 1 && map[i + 1][j] == 1 && map[i][j + 1] == 1 && map[i + 1][j + 1] == 1){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
