import java.util.*;

public class SW5658 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int test_case = 1; test_case <= tc; test_case++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int numberLength = n / 4;

            String str = sc.next();

            ArrayList<Character> box = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                box.add(str.charAt(i));
            }

            ArrayList<Integer> numberList = new ArrayList<>();

            for (int i = 0; i < numberLength; i++) {
                String numberStr1 = str.substring(0, numberLength);
                String numberStr2 = str.substring(numberLength, numberLength * 2);
                String numberStr3 = str.substring(numberLength * 2, numberLength * 3);
                String numberStr4 = str.substring(numberLength * 3, numberLength * 4);

                int number1 = Integer.parseInt(numberStr1, 16);
                int number2 = Integer.parseInt(numberStr2, 16);
                int number3 = Integer.parseInt(numberStr3, 16);
                int number4 = Integer.parseInt(numberStr4, 16);

                int[] tempArray = new int[4];

                tempArray[0] = number1;
                tempArray[1] = number2;
                tempArray[2] = number3;
                tempArray[3] = number4;

                for (int j = 3; j >= 0; j--) {
                    if (!numberList.contains(tempArray[j])) {
                        numberList.add(tempArray[j]);
                    }
                }

                str = str.substring(n - 1, n) + str.substring(0, n - 1);
            }

            Collections.sort(numberList);
            Collections.reverse(numberList);

            System.out.println("#" + test_case + " " + numberList.get(k - 1));
        }
    }
}
