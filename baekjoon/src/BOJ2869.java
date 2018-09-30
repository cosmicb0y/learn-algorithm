import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();

        long answer = (long) Math.ceil((double)(v - a)/(a - b));

        System.out.println(answer + 1);
    }
}
