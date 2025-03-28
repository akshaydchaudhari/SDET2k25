package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateArray {

    /*Programming: 1- Program to Remove duplicates from Array without changing the order?
    input: int [] arr = {5,6,7,3,3,7,5};
    output: arr = {5,6,7,3};*/

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 3, 3, 7, 5};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {

            set.add(num);
        }

        System.out.println(set);
        int[] uniqueArr = new int[set.size()];

        int i = 0;

        for (int num : set) {

            uniqueArr[i++] = num;
        }
        System.out.println(Arrays.toString(uniqueArr));
    }
}
