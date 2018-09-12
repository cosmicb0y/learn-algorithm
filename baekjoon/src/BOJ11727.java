import java.util.Scanner;

public class BOJ11727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] intArray = new int[1001];

        intArray[0] = 1;
        intArray[1] = 1;

        for (int i = 2; i <= num; i++) {
            intArray[i] = (intArray[i - 1] + 2 * intArray[i - 2]) % 10007;
        }

        System.out.println(intArray[num]);
    }
}
