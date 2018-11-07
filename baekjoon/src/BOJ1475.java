import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int[] num = new int[10];

        for (int i = 0; i < input.length; i++) {
            int digit = input[i] - '0';
            num[digit]++;
        }

        if ((num[6] + num[9]) % 2 == 1) {
            num[9] = (num[6] + num[9]) / 2 + 1;
        }
        else {
            num[9] = (num[6] + num[9]) / 2;
        }
        num[6] = 0;
        Arrays.sort(num);

        System.out.println(num[9]);
    }
}
