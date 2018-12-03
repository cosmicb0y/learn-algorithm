import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toUpperCase().toCharArray();

        int[] alpha = new int[26];

        int length = input.length;
        for (int i = 0; i < length; i++) {
            alpha[input[i] - 'A']++;
        }

        int max = 0;
        char answer = 'A';
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                answer = (char) Math.max(answer, i + 'A');
            }
        }

        Arrays.sort(alpha);

        if (alpha[25] == alpha[24])
            answer = '?';

        System.out.println(answer);

    }
}
