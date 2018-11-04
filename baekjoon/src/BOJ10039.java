import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input < 40) {
                input = 40;
            }
            total += input;
        }
        System.out.println(total/5);
    }
}
