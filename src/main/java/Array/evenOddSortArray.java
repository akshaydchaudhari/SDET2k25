package Array;

import java.util.Arrays;

public class evenOddSortArray {


    public static void main(String[] args) {

//        Given an array int arr [] = {2,5,8,7,1,3,6,4,5,9}; shift all even numbers to the left and odd numbers
//        to the right. Optimize it if possible

        int arr[] = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
        evenOddSort(arr);
        System.out.println(Arrays.toString(arr));
        int arr1[] = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
        rearrangeEvenOdd(arr1);
        System.out.println(Arrays.toString(arr1));


    }

    private static void evenOddSort(int[] arr) {


        int left = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] % 2 == 0) {

                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;

            }

        }
      /*  for (int a : arr) {

            System.out.print(a + " ");
        }*/

    }


    public static void rearrangeEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until an odd number is found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer until an even number is found
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap found odd (left) and even (right) numbers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
