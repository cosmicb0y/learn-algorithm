import java.util.Scanner;

public class BOJ11726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] numArray = new int[1001];

        numArray[1] = 1;
        numArray[2] = 2;

        for (int i = 3; i <= num; i++) {
            numArray[i] = (numArray[i - 1] + numArray[i - 2]) % 10007;
        }

        System.out.println(numArray[num]);
    }
}
