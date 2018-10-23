import java.io.*;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        int[] num = new int[26];
        Arrays.fill(num, -1);

        for (int i = 0; i < input.length; i++) {
            for (int j = 'a'; j <= 'z'; j++) {
                if (input[i] == j && num[j - 'a'] < 0) {
                    num[j - 'a'] = i;
                    break;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(num[i] + " ");
        }

        bw.write("\n");
        bw.flush();
    }
}
