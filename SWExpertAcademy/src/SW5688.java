import java.util.Scanner;

public class SW5688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 0; a < t; a++) {
            long n = sc.nextLong();

            long answer = -1;
            for (long i = 1; i < 10e6; i++) {
                if (i * i * i == n)
                    answer = i;
            }
            System.out.println("#" + a + " " + answer);
        }
    }
}
