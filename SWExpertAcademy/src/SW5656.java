import java.util.Scanner;

public class SW5656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 1; a <= t; a++) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();

            int[][] blockInput = new int[h + 1][w + 1];
            int[][] map = new int[h + 1][w + 1];

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    blockInput[i][j] = sc.nextInt();
                }
            }

            int[] B = new int[4];
            int answer = Integer.MAX_VALUE;

            for (B[0] = 1; B[0] <= w; B[0]++) {
                for (B[1] = 1; B[1] <= w; B[1]++) {
                    for (B[2] = 1; B[2] <= w; B[2]++) {
                        for (B[3] = 1; B[3] <= w; B[3]++) {
                            init(w, h, blockInput, map);

                            for (int i = 0; i < n; i++){
                                bomb(w, h, map, B[i]);

                                down(w, h, map);
                            }
                            answer = block_check(w, h, map, answer);
                            if (n < 4) break;
                        }
                        if (n < 3) break;
                    }
                    if (n < 2) break;
                }
            }
            System.out.println("#" + a + " " + answer);

        }
    }

    private static void bomb(int w, int h, int[][] map, int i) {
        for (int j =  1; j <= h; j++) {
            if (map[j][i] == 1) {
                map[j][i] = 0;
                return;
            }
            else if (map[j][i] > 1) {
                map[j][i] += 10;
                break;
            }
        }

        boolean flag = true;

        while (flag) {
            flag = boom(w, h, map);
        }
    }

    private static int block_check(int w, int h, int[][] map, int answer) {
        int count = 0;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j<= w; j++) {
                if (map[i][j] > 0) count++;
            }
        }

        return Math.min(count, answer);
    }

    private static void down(int w, int h, int[][] map) {
        for (int i = 1; i <= w; i++) {
            for (int j = h; j > 0; j--) {
                if (map[j][i] == 0) {
                    for (int k = j - 1; k > 0; k--) {
                        if (map[k][i] > 0) {
                            map[j][i] = map[k][i];
                            map[k][i] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static boolean boom(int w, int h, int[][] map) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (map[i][j] > 10) {
                    int d = map[i][j] - 10;
                    map[i][j] = 0;


                    boolean flag = false;

                    int left = Math.max(j - d + 1, 1);
                    int right = Math.min(j + d, w + 1);

                    for (int k = left; k < right; k++) {
                        if (map[i][k] == 1) {
                            map[i][k] = 0;
                        }
                        else if (map[i][k] > 1 && map[i][k] < 10) {
                            map[i][k] += 10;
                            flag = true;
                        }
                    }

                    int up = Math.max(i - d + 1, 1);
                    int down = Math.min(i + d, h + 1);

                    for (int k = up; k < down; k++) {
                        if (map[k][j] == 1) {
                            map[k][j] = 0;
                        }
                        else if (map[k][j] > 1 && map[k][j] < 10) {
                            map[k][j] += 10;
                            flag = true;
                        }
                    }

                    if (flag) return true;
                }
            }
        }
        return false;
    }

    private static void init(int w, int h, int[][] blockInput, int[][] map) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                map[i][j] = blockInput[i][j];
            }
        }
    }
}
