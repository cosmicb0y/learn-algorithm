import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int room[] = new int[n];

        for (int i = 0; i < n; i++) {
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long count = 0;

        for (int i = 0; i < n; i++) {
            room[i] -= b;
            count++;
            while (room[i] > 0) {
                room[i] -= c;
                count++;
            }
        }

        System.out.println(count);
    }
}
