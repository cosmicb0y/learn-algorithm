import java.util.Scanner;

public class SW5648 {
    static int[][] atom = new int[1000][4];
    static int[][] visit = new int[4005][4005];
    static boolean[][] collided = new boolean[4005][4005];

    static void RemoveAtom(int n, int pnSize) {
        int nLastIndex = pnSize - 1;
        atom[n][0] = atom[nLastIndex][0];
        atom[n][1] = atom[nLastIndex][1];
        atom[n][2] = atom[nLastIndex][2];
        atom[n][3] = atom[nLastIndex][3];
        return;
    }

    static Scanner sc = new Scanner(System.in);

    static int solution(int N) {
        int nRest = N;
        int ans = 0;

        for (int j = 0; j < nRest; ++j) {
            atom[j][0] = atom[j][0] * 2;
            atom[j][1] = atom[j][1] * 2;
            visit[atom[j][0]][atom[j][1]]++;
        }

        int nMaxLoop = 4002;

        for (int i = 0; i < nMaxLoop; ++i) {
            for (int j = 0; j < nRest; ++j) {
                int d = atom[j][2];
                visit[atom[j][0]][atom[j][1]]--;
                if (d == 0) atom[j][1]++;
                else if (d == 1) atom[j][1]--;
                else if (d == 2) atom[j][0]--;
                else if (d == 3) atom[j][0]++;

                if (atom[j][0] < 0 || atom[j][0] > 4000 || atom[j][1] < 0 || atom[j][1] > 4000) {
                    RemoveAtom(j, nRest);
                    nRest--;
                    j--;
                } else {
                    visit[atom[j][0]][atom[j][1]]++;
                    if (visit[atom[j][0]][atom[j][1]] >= 2)
                        collided[atom[j][0]][atom[j][1]] = true;
                }
            }

            for (int j = 0; j < nRest; ++j) {
                if (collided[atom[j][0]][atom[j][1]] == true) {
                    if (visit[atom[j][0]][atom[j][1]] == 1)
                        collided[atom[j][0]][atom[j][1]] = false;
                    visit[atom[j][0]][atom[j][1]]--;
                    ans += atom[j][3];
                    RemoveAtom(j, nRest);
                    nRest--;
                    j--;
                }
            }

            if (nRest == 0) break;

        }
        return ans;
    }

    public static void main(String[] args) {
        int test_case;
        int T = sc.nextInt();

        for (test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();


            for (int i = 0; i < N; ++i) {
                atom[i][0] = sc.nextInt();
                atom[i][1] = sc.nextInt();
                atom[i][2] = sc.nextInt();
                atom[i][3] = sc.nextInt();
                atom[i][0] += 1000;
                atom[i][1] += 1000;
            }
            int ans = solution(N);
            System.out.println("#" + test_case + " " + ans);
        }
        sc.close();
    }
}