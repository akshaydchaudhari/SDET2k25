package Array;

import java.util.Arrays;

public class mergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArray = mergetwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

    }

    private static int[] mergetwoArrays(int[] arr1, int[] arr2) {

        int[] mergeeArrays = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergeeArrays, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeeArrays, arr1.length, arr2.length);
        return mergeeArrays;
    }
}
