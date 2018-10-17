import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());

            char[] charArr = st.nextToken().toCharArray();

            int len = charArr.length;

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(charArr[i]);
                }
            }
            System.out.println();
        }
    }
}
