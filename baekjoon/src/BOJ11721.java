import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (int i = 0; i < input.length() ; i += 10) {
            System.out.println(input.substring(i, Math.min(i + 10, input.length())));
        }
    }
}
