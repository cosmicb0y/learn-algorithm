import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int[][] map = new int[15][14];

        for (int i = 0; i < 14; i++) {
            map[0][i] = i + 1;
        }

        for (int i = 1; i < 15; i++) {
            map[i][0] = map[i - 1][0];
            for (int j = 1; j < 14; j++) {
                map[i][j] = map[i][j - 1] + map[i - 1][j];
            }
        }

        for (int testcast = 0; testcast < tc; testcast++) {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            System.out.println(map[x][y - 1]);
        }
    }
}
