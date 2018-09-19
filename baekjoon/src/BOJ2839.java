import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int answer = -1;
        for (int i = 0; i * 5 <= n; i++) {
            for (int j = 0; i * 5 + j * 3 <= n; j++) {
                if (i * 5 + j * 3 == n) {
                    answer = i + j;
                }
            }
        }

        System.out.println(answer);
    }
}
