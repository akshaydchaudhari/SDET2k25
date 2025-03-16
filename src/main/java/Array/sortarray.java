package Array;

public class sortarray {

/*    Given an integer array contains only 0’s and 1’s. Write a program to sort the array using:
      1. Only one for loop
      2. Sort/swap the elements in the same array.
      input = {1,0,0,1,1,0,1,0,0,1,1};
      output = {0,0,0,0,0,1,1,1,1,1};*/


    public static void main(String[] args) {

        int[] arr1 = {1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        rotateArraa(arr1);

        System.out.println();

        sortArr(arr1);
    }


    private static void rotateArraa(int[] arr) {

        int left = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 1) {

                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        for (int a : arr) {

            System.out.print(a + " ");
        }

    }

    private static void sortArr(int[] arr) {

        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        for (int a : arr) {

            System.out.print(a + " ");
        }


    }

}
