package Array;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 2, 5, 7, 4, 2};

        freqofElemts(arr);

        int[] arr2 = {2, 4, 2, 1, 3};

        freqOfElement2(arr);
    }

    private static void freqofElemts(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    //Aproch 2

    private static void freqOfElement2(int[] arr) {

        int[] visitedArr = new int[arr.length];

        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visitedArr[j] = visited;

                }
            }
            if (visitedArr[i] != visited) {
                visitedArr[i] = count;
            }

        }
        for (int i = 0; i < visitedArr.length; i++) {
            if (visitedArr[i] != visited) {
                System.out.println("Frequency of " + arr[i] + " : " + visitedArr[i]);
            }
        }
    }
}
