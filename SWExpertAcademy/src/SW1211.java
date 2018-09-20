import java.util.Scanner;

public class SW1211 {
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

            int min = 10001;
            int minStart = 0;
            for (int i = 1; i <= 100; i++) {
                if (ladder[1][i] == 0) continue;
                int count = 0;
                int end = i;

                Dir dir = Dir.DOWN;

                int height = 1;

                while (height < 100) {
                    if (dir == Dir.DOWN) {
                        if (ladder[height][end - 1] > 0) {
                            dir = Dir.LEFT;
                        }
                        if (ladder[height][end + 1] > 0) {
                            dir = Dir.RIGHT;
                        }
                    } else if (dir == Dir.LEFT || dir == Dir.RIGHT) {
                        if (ladder[height + 1][end] > 0) {
                            dir = Dir.DOWN;
                        }
                    }

                    if (dir == Dir.DOWN) {
                        height++;
                    } else if (dir == Dir.LEFT) {
                        end--;
                    } else if (dir == Dir.RIGHT) {
                        end++;
                    } else {
                        System.err.println("Something wrong");
                    }
                    count++;
                }

                if (count <= min) {
                    min = count - 1;
                    minStart = i;
                }
            }

            System.out.println("#" + a + " " + minStart);
        }
    }

    public enum Dir {
        LEFT, DOWN, RIGHT
    }
}
