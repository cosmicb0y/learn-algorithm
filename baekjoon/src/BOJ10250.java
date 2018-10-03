import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int test_case = 0; test_case < tc; test_case++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            String floor;

            int a = n % h;
            int b = n / h + 1;

            if (a == 0) {
                floor = Integer.toString(h);
                b--;
            }
            else {
                floor = Integer.toString(a);
            }
             String number;

            if (b < 10) {
                number = "0" + Integer.toString(b);
            }
            else {
                number = Integer.toString(b);
            }

            System.out.println(floor + number);

        }
    }
}
