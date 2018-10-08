import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int grade = Integer.parseInt(st.nextToken());

        char answer = 'F';
        switch (grade / 10) {
            case 10:
            case 9:
                answer = 'A';
                break;
            case 8:
                answer = 'B';
                break;
            case 7:
                answer = 'C';
                break;
            case 6:
                answer = 'D';
                break;
        }

        System.out.println(answer);
    }
}
