package Array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotateArr(arr.clone(), 2);
    }

    public static void rotateArr(int[] arr, int steps) {
        steps = steps % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, arr.length - 1);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
