import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] eat = new int[n];

        for (int i = 0; i < n; i++) {
            eat[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(eat);

        for (int i = 0; i < n; i++) {
            if (eat[i] <= l) l++;
            else break;
        }

        System.out.println(l);
    }
}
