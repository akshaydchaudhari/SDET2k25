package Array;

import java.util.Arrays;

public class NegativeSort {

    /*Given an array of integers, write a function to move all the negative numbers to the left end of the array without changing the relative order of the non-negative numbers. The function should do this in place with a minimum number of operations.
        Example:
        int[] nums = {1, -1, 3, -2, -3, 5, 6, -7}
        Output: [-1, -2, -3, -7, 1, 3, 5, 6]*/

    public static void main(String[] args) {
        int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};

        NegativeSortrray(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void NegativeSortrray(int[] arr) {

        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                for (int j = i; j > left; j--) {
                    arr[j] = arr[j - 1];

                }
                arr[left] = temp;
                left++;
            }


        }
      /*  for (int a : arr) {

            System.out.print(a + " ");
        }*/


    }
}
