import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] numArray = sc.next().toCharArray();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numArray[i] - '0';
        }

        System.out.println(sum);
    }
}
