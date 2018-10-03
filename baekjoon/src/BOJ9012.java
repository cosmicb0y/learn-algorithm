import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] input = sc.next().toCharArray();
            Stack<Integer> stack = new Stack<>();
            if (input[0] == ')') {
                System.out.println("NO");
                continue;
            }
            boolean valid = true;
            for (int j = 0; j < input.length; j++) {
                if (input[j] == '(') {
                    stack.push(1);
                }
                else if (input[j] == ')') {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        valid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!valid) {
                continue;
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
