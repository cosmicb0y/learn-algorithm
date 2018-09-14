import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        BigInteger[][] bigIntArray = new BigInteger[91][2];

        bigIntArray[1][0] = BigInteger.ZERO;
        bigIntArray[1][1] = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            bigIntArray[i][0] = bigIntArray[i - 1][0].add(bigIntArray[i - 1][1]);
            bigIntArray[i][1] = bigIntArray[i - 1][0];
        }

        BigInteger sum = bigIntArray[num][0].add(bigIntArray[num][1]);

        System.out.println(sum.toString());
    }
}
