import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        quicksort(array, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(array, left, right);
        quicksort(array, left, pivot - 1);
        quicksort(array, pivot + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int wall = left;
        int pivot = right;

        for (int i = left; i < right; i++) {
            if (array[i] <= array[pivot]) {
                int temp = array[wall];
                array[wall] = array[i];
                array[i] = temp;
                wall++;
            }
        }
        int temp = array[wall];
        array[wall] = array[pivot];
        array[pivot] = temp;

        return wall;
    }


}
