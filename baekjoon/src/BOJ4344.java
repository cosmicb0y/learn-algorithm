import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int t = 0; t < c; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++) {
                score[i] = Integer.parseInt(st.nextToken());
                sum += score[i];
            }

            double aver = (double) sum / n;

            int good = 0;
            for (int i = 0; i < n; i++) {
                if (score[i] > aver) {
                    good++;
                }
            }

            System.out.println(String.format("%.3f", (double)good / n * 100) + "%");


        }
    }
}
