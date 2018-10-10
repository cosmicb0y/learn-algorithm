import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW4013 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] wheel = new int[4][8];
        int[][] wheelPole = new int[4][2];

        int tc = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= tc; test_case++) {
            int k = Integer.parseInt(br.readLine());

            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 8; j++) {
                    wheel[i][j] = Integer.parseInt(st.nextToken());
                }
                wheelPole[i][1] = 2;
                wheelPole[i][0] = 6;
            }


            for (int t = 0; t < k; t++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[][] afterSpin = new int[4][2];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        afterSpin[i][j] = -1;

                    }
                }
                int wheelNum = Integer.parseInt(st.nextToken()) - 1;
                int wheelDir = Integer.parseInt(st.nextToken());
                if (wheelDir == 1) {
                    wheelDir = 7;
                } else {
                    wheelDir = 1;
                }

                for (int i = 0; i < 2; i++) {
                    afterSpin[wheelNum][i] = (wheelPole[wheelNum][i] + wheelDir) % 8;
                }

                int curWheel = wheelNum;
                int curWheelDir = wheelDir;
                boolean spin = true;
                while (curWheel < 3 && spin) {
                    if (wheel[curWheel][wheelPole[curWheel][1]] != wheel[curWheel + 1][wheelPole[curWheel + 1][0]]) {
                        if (curWheelDir == 1) {
                            curWheelDir = 7;
                        } else {
                            curWheelDir = 1;
                        }

                        for (int i = 0; i < 2; i++) {
                            afterSpin[curWheel + 1][i] = (wheelPole[curWheel + 1][i] + curWheelDir) % 8;
                        }

                    } else {
                        spin = false;
                    }
                    curWheel++;
                }

                curWheel = wheelNum;
                curWheelDir = wheelDir;
                spin = true;
                while (curWheel > 0 && spin) {
                    if (wheel[curWheel][wheelPole[curWheel][0]] != wheel[curWheel - 1][wheelPole[curWheel - 1][1]]) {
                        if (curWheelDir == 1) {
                            curWheelDir = 7;
                        } else {
                            curWheelDir = 1;
                        }

                        for (int i = 0; i < 2; i++) {
                            afterSpin[curWheel - 1][i] = (wheelPole[curWheel - 1][i] + curWheelDir) % 8;
                        }

                    } else {
                        spin = false;
                    }
                    curWheel--;
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (afterSpin[i][j] != -1) {
                            wheelPole[i][j] = afterSpin[i][j];
                        }

                    }
                }
            }

            int answer = 0;
            int mul = 1;

            for (int i = 0; i < 4; i++) {
                answer += wheel[i][(wheelPole[i][0] + 2) % 8] * mul;
                mul *= 2;
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
