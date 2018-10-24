import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        float[] input = new float[n];
        for (int i = 0; i < n; i++) {
            input[i] = Float.parseFloat(st.nextToken());
        }

        Arrays.sort(input);

        float max = input[n - 1];

        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input[i] / max * 100;
        }

        System.out.println(sum/n);
    }
}
