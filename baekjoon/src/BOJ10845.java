import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int t = 0; t < n; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    int pop = -1;
                    if (!queue.isEmpty()) {
                        pop = queue.poll();
                    }
                    System.out.println(pop);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    int empty = 0;
                    if (queue.isEmpty()) empty = 1;
                    System.out.println(empty);
                    break;
                case "front":
                    int front = -1;
                    if (!queue.isEmpty()) {
                        front = ((LinkedList<Integer>) queue).getFirst();
                    }
                    System.out.println(front);
                    break;
                case "back":
                    int back = -1;
                    if (!queue.isEmpty()) {
                        back = ((LinkedList<Integer>) queue).getLast();
                    }
                    System.out.println(back);
                    break;
            }
        }
    }
}
