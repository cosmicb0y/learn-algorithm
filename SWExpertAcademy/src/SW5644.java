import java.util.Scanner;

public class SW5644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int test_case = 1; test_case <= tc; test_case++) {
            int m = sc.nextInt();
            int a = sc.nextInt();

            int[] aMove = new int[m + 1];
            int[] bMove = new int[m + 1];

            for (int i = 1; i <= m; i++) {
                aMove[i] = sc.nextInt();
            }

            for (int i = 1; i <= m; i++) {
                bMove[i] = sc.nextInt();
            }

            int[][][] map = new int[11][11][2];

            for (int i = 1; i <= a; i++) {
                int y = sc.nextInt();
                int x = sc.nextInt();
                map[x][y][0] = sc.nextInt();
                map[x][y][1] = sc.nextInt();
            }

            int ax = 1;
            int ay = 1;

            int bx = 10;
            int by = 10;

            int answer = 0;

            for (int move = 0; move <= m; move++) {
                int[] aStation = new int[a + 1];
                int[] bStation = new int[a + 1];

                switch (aMove[move]) {
                    case 0:
                        break;
                    case 1:
                        ax--;
                        break;
                    case 2:
                        ay++;
                        break;
                    case 3:
                        ax++;
                        break;
                    case 4:
                        ay--;
                        break;
                }

                switch (bMove[move]) {
                    case 0:
                        break;
                    case 1:
                        bx--;
                        break;
                    case 2:
                        by++;
                        break;
                    case 3:
                        bx++;
                        break;
                    case 4:
                        by--;
                        break;
                }

                int index = 0;
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        if (map[i][j][0] > 0) {
                            index++;
                            if (distance(i, j, ax, ay) <= map[i][j][0]) {
                                aStation[index] = map[i][j][1];
                            }
                            if (distance(i, j, bx, by) <= map[i][j][0]) {
                                bStation[index] = map[i][j][1];
                            }
                        }
                    }
                }

                int aIndex = 0;
                int bIndex = 0;
                int aPrevious = 0;
                int bPrevious = 0;

                int aMax = 0;
                int bMax = 0;

                for (int i = 1; i <= a; i++) {
                    if (aStation[i] > aMax) {
                        aPrevious = aIndex;
                        aMax = aStation[i];
                        aIndex = i;
                    }
                    if (bStation[i] > bMax) {
                        bPrevious  = bIndex;
                        bMax = bStation[i];
                        bIndex = i;
                    }
                }

                for (int i = aIndex + 1; i <= a; i++) {
                    if (aStation[i] > aStation[aPrevious]) {
                        aPrevious = i;
                    }
                }

                for (int i = bIndex + 1; i <= a; i++) {
                    if (bStation[i] > bStation[bPrevious]) {
                        bPrevious = i;
                    }
                }

                if (aIndex == bIndex) {
                    answer += Math.max(Math.max((aStation[aIndex] + bStation[bIndex]) / 2, aStation[aIndex] + bStation[bPrevious]),aStation[aPrevious] + bStation[bIndex]);
                }
                else {
                    answer += aStation[aIndex] + bStation[bIndex];
                }
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }

    public static int distance(int a1, int b1, int a2, int b2) {
        return Math.abs(a1 - a2) + Math.abs(b1 - b2);
    }
}
