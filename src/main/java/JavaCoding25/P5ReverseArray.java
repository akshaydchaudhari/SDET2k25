package JavaCoding25;

import java.util.Arrays;

public class P5ReverseArray {

    public static void main(String[] args) {

        int[] inputArr = {1,4,2,6,3,7,3};

        System.out.println(Arrays.toString(inputArr));

        revArr(inputArr);

        System.out.println(Arrays.toString(inputArr));
    }

    public static void revArr(int[] arr) {

        int start =0;
        int end = arr.length-1;

        while (start<end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

}

