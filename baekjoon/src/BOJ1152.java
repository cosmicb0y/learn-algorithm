import java.util.Scanner;

public class BOJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        if (input.length() > 0) {
            System.out.println(input.length() - input.replaceAll(" ", "").length() + 1);
        }
        else {
            System.out.println(0);
        }
    }
}
