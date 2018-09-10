import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int [] intArray = new int[1000001];

        Arrays.fill(intArray, -1);

        Queue q = new LinkedList();
        Queue countQ = new LinkedList();

        q.offer(1);
        countQ.offer(0);

        while (intArray[num] < 0) {
            int present = (int) q.poll();
            if (intArray[present] < 0) {
                int presentCount = (int) countQ.poll();
                intArray[present] = presentCount;
                if (present + 1 < 1000001 && intArray[present + 1] < 0) {
                    q.offer(present + 1);
                    countQ.offer(presentCount + 1);
                }
                if (present * 2 < 1000001 && intArray[present * 2] < 0) {
                    q.offer(present * 2);
                    countQ.offer(presentCount + 1);
                }
                if (present * 3 < 1000001 && intArray[present * 3] < 0) {
                    q.offer(present * 3);
                    countQ.offer(presentCount + 1);
                }
            }
            else
            {
                countQ.poll();
            }
        }

        System.out.println(intArray[num]);
    }
}
