import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());

        int[] xDir = new int[]{0, -1, 1, 0, 0};
        int[] yDir = new int[]{0, 0, 0, -1, 1};

        for (int test_case = 1; test_case <= tc; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int map[][] = new int[n][n];
            int mapDir[][] = new int[n][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                int dir = Integer.parseInt(st.nextToken());

                map[x][y] = num;
                mapDir[x][y] = dir;
            }

            int answer = 0;
            for (int time = 0; time < m; time++) {
                int moved[][][] = new int[n][n][5];
                int nextMap[][] = new int[n][n];
                int nextDir[][] = new int[n][n];

                answer = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (map[i][j] > 0) {
                            int nextX = i + xDir[mapDir[i][j]];
                            int nextY = j + yDir[mapDir[i][j]];
                            moved[nextX][nextY][mapDir[i][j]] = map[i][j];
                            moved[nextX][nextY][0]++;
                        }
                        if (i > 0) {
                            if (moved[i - 1][j][0] > 0) {
                                int sum = 0;
                                int largest = 0;
                                int largestIndex = 0;
                                for (int l = 1; l < 5; l++) {
                                    sum += moved[i - 1][j][l];
                                    if (moved[i - 1][j][l] > largest) {
                                        largest = moved[i - 1][j][l];
                                        largestIndex = l;
                                    }
                                }
                                nextMap[i - 1][j] = sum;
                                nextDir[i - 1][j] = largestIndex;

                                if (i > 1 && j > 0 && j < n -1) {
                                    answer += sum;
                                }

                            }
                        }
                        if (i == n - 1) {
                            if (moved[i][j][0] > 0) {
                                int sum = 0;
                                int largest = 0;
                                int largestIndex = 0;
                                for (int l = 1; l < 5; l++) {
                                    sum += moved[i][j][l];
                                    if (moved[i][j][l] > largest) {
                                        largest = moved[i][j][l];
                                        largestIndex = l;
                                    }
                                }
                                nextMap[i][j] = sum;
                                nextDir[i][j] = largestIndex;
                            }

                        }
                    }
                }


                for (int i = 0; i < n; i++) {
                    if (nextMap[0][i] > 0) {
                        nextMap[0][i] /= 2;
                        if (nextDir[0][i] == 1) nextDir[0][i] = 2;
                        else if (nextDir[0][i] == 2) nextDir[0][i] = 1;
                        else if (nextDir[0][i] == 3) nextDir[0][i] = 4;
                        else if (nextDir[0][i] == 4) nextDir[0][i] = 3;
                        answer += nextMap[0][i];
                    }
                }

                for (int i = 1; i < n - 1; i++) {
                    if (nextMap[i][0] > 0) {
                        nextMap[i][0] /= 2;
                        if (nextDir[i][0] == 1) nextDir[i][0] = 2;
                        else if (nextDir[i][0] == 2) nextDir[i][0] = 1;
                        else if (nextDir[i][0] == 3) nextDir[i][0] = 4;
                        else if (nextDir[i][0] == 4) nextDir[i][0] = 3;
                        answer += nextMap[i][0];

                    }
                    if (nextMap[i][n - 1] > 0) {
                        nextMap[i][n - 1] /= 2;
                        if (nextDir[i][n - 1] == 1) nextDir[i][n - 1] = 2;
                        else if (nextDir[i][n - 1] == 2) nextDir[i][n - 1] = 1;
                        else if (nextDir[i][n - 1] == 3) nextDir[i][n - 1] = 4;
                        else if (nextDir[i][n - 1] == 4) nextDir[i][n - 1] = 3;
                        answer += nextMap[i][n - 1];
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (nextMap[n - 1][i] > 0) {
                        nextMap[n - 1][i] /= 2;
                        if (nextDir[n - 1][i] == 1) nextDir[n - 1][i] = 2;
                        else if (nextDir[n - 1][i] == 2) nextDir[n - 1][i] = 1;
                        else if (nextDir[n - 1][i] == 3) nextDir[n - 1][i] = 4;
                        else if (nextDir[n - 1][i] == 4) nextDir[n - 1][i] = 3;
                        answer += nextMap[n - 1][i];
                    }
                }

                map = nextMap;
                mapDir = nextDir;
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
