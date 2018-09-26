import java.util.Scanner;

public class SW3750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int test_case = 1; test_case <= tc; test_case++) {
            String numberStr = sc.next();

            char[] numberChar = numberStr.toCharArray();
            int sum = 0;

            for (int i = 0; i < numberChar.length; i++) {
                sum += numberChar[i] - '0';
            }

            while (sum > 9) {
                sum = sum % 10 + sum / 10;
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
