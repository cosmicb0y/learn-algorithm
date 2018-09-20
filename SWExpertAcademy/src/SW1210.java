import java.util.Scanner;

public class SW1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int a = 1; a <= 10; a++) {
            int[][] ladder = new int[101][102];
            int n = sc.nextInt();

            for (int i = 1; i <= 100; i++) {
                for (int j = 1; j <= 100; j++) {
                    ladder[i][j] = sc.nextInt();
                }
            }

            int end = 0;

            for (int i = 1; i <= 100; i++) {
                if (ladder[100][i] > 1) {
                    end = i;
                }
            }

            Dir dir = Dir.UP;

            int height = 100;

            while (height > 1) {
                if (dir == Dir.UP) {
                    if (ladder[height][end - 1] > 0) {
                        dir = Dir.LEFT;
                    }
                    if (ladder[height][end + 1] > 0) {
                        dir = Dir.RIGHT;
                    }
                }
                else if (dir == Dir.LEFT || dir == Dir.RIGHT) {
                    if (ladder[height - 1][end] > 0) {
                        dir = Dir.UP;
                    }
                }

                if (dir == Dir.UP) {
                    height--;
                }
                else if (dir == Dir.LEFT) {
                    end--;
                }
                else if (dir == Dir.RIGHT) {
                    end++;
                }
                else {
                    System.err.println("Something wrong");
                }
            }

            System.out.println("#" + a + " " + end);
        }
    }

    public enum Dir {
        LEFT, UP, RIGHT
    }
}
