package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArray = mergetwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

        System.out.println("******************************************************");

        System.out.println(Arrays.toString(new String[]{Arrays.toString(mergrtwoArr(arr1, arr2))}));


    }

    private static int[] mergetwoArrays(int[] arr1, int[] arr2) {

        int[] mergeeArrays = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergeeArrays, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeeArrays, arr1.length, arr2.length);
        return mergeeArrays;
    }

    private static int[] mergrtwoArr(int[] arr1, int[] arr2) {

        int[] mergrarr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();

//        Arrays.stream(mergrarr).forEach(num -> System.out.print(num + " "));

        return mergrarr;
    }

}
