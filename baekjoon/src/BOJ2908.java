import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[2];
        for (int t = 0; t < 2; t++) {
            char[] input = st.nextToken().toCharArray();

            String inputStr = "";
            for (int i = 2; i >= 0; i--) {
                inputStr += input[i];
            }
            num[t] = Integer.parseInt(inputStr);
        }

        System.out.println(Math.max(num[0], num[1]));
    }
}
