package JavaCoding25;

import java.util.Arrays;

public class P9MaxMinNumber {

    public static void main(String[] args) {

        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[] {3, 4})); // 3

        System.out.println("------");
        System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 8
        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 2
        System.out.println(secMin(new int[] {3, 4})); // 4


        System.out.println("------");
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 1)); // 9
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 2)); // 8
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 3)); // 5
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 100)); // 0




    }

    public static int secMax(int[] arr) {

        int maxIndex = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (i != maxIndex && secondMax < arr[i]) {

                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int secMin(int[] arr) {

        int minIndex = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {

                min = arr[i];
                minIndex = i;

            }
        }
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (i != minIndex && secondMin > arr[i]) {

                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    public static int nMax(int[] arr, int n) {

        if(n >arr.length ||  n<1) {

            return 0;
        }
        Arrays.sort(arr);

        return arr[arr.length-n];
    }

}
