import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int totalDay = -1;

        switch (month) {
            case 12:
                totalDay += 30;
            case 11:
                totalDay += 31;
            case 10:
                totalDay += 30;
            case 9:
                totalDay += 31;
            case 8:
                totalDay += 31;
            case 7:
                totalDay += 30;
            case 6:
                totalDay += 31;
            case 5:
                totalDay += 30;
            case 4:
                totalDay += 31;
            case 3:
                totalDay += 28;
            case 2:
                totalDay += 31;
        }

        totalDay += day;

        totalDay %= 7;

        String answer = "";
        switch (totalDay) {
            case 0:
                answer = "MON";
                break;
            case 1:
                answer = "TUE";
                break;
            case 2:
                answer = "WED";
                break;
            case 3:
                answer = "THU";
                break;
            case 4:
                answer = "FRI";
                break;
            case 5:
                answer = "SAT";
                break;
            case 6:
                answer = "SUN";
                break;
        }

        System.out.println(answer);
    }
}
