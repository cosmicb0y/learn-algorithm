import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cycle = 0;

        int nextNum = n;

        do {
            nextNum = (nextNum % 10) * 10 + (nextNum / 10 + nextNum % 10) % 10;
            cycle++;
        } while (nextNum != n);

        System.out.println(cycle);
    }
}
