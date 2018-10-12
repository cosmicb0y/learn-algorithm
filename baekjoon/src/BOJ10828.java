import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            if (op.equals("top")) {
                if (stack.empty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.lastElement());
                }
            }
            if (op.equals("pop")) {
                if (stack.empty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }

            if (op.equals("size")) {
                System.out.println(stack.size());
            }

            if (op.equals("empty")) {
                if (stack.empty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }

        }

    }
}
