package JavaCoding25;

import java.util.Arrays;

public class P14SumOfTwo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sum1(new int[]{1, 2, 3, 5}, 4)));

    }

    public static int[] sum1(int[] numArra, int num) {

        int[] sumNumbers = new int[2];

        for (int i = 0; i < numArra.length; i++) {
            for (int j = i + 1; j < numArra.length; j++) {

                if (numArra[i] + numArra[j] == num) {

                    sumNumbers[0] = numArra[i];
                    sumNumbers[1] = numArra[j];

                }
            }
        }
        return sumNumbers;
    }
}
