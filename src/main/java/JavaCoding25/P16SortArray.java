package JavaCoding25;

import java.util.Arrays;

public class P16SortArray {

    public static void main(String[] args) {
        /* int[] arrNum = {5,6,3,1,9,2,4,1,5,2};
        System.out.println(Arrays.toString((arrNum)));
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum));*/

        System.out.println(Arrays.toString(sSort(new int[]{5, 6, 3, 1, 9, 2, 4, 1, 5, 2})));


        int[] arrNum = new int[]{6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]


    }

    /**
     * Selection Sort
     * The main idea to keep finding the smallest element and put it the beginning of array.
     */
    public static int[] sSort(int[] arr) {
        //loop over each element
        for (int i = 0; i < arr.length; i++) {

            int mIndex = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = temp;
        }

        return arr;
    }

    /**
     * Bubble Sort
     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
     * if they are not in correct order.
     */


    public static void bSort(int[] arr) {

        int swapCounter = -1;

        while (swapCounter != 0) {

            swapCounter = 0;


            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCounter++;
                }
            }
        }
    }

}
