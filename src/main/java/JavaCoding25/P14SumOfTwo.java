package JavaCoding25;

import java.util.Arrays;

public class P14SumOfTwo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 5}, 4)));

    }

    public static int[] sum(int numArra[], int num) {

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

  /*  public static int[] sum(int numArr[], int num) {
        int[] sumNumbers = new int[2];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == num) {
                    sumNumbers[0] = numArr[i];
                    sumNumbers[1] = numArr[j];
                }
            }
        }

        return sumNumbers;
    }*/


}
