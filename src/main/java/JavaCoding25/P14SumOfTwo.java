package JavaCoding25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P14SumOfTwo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sum1(new int[]{1, 2, 3, 5}, 4)));
        System.out.println(Arrays.toString(findTwoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] sum1(int[] numArra, int num) {

        int[] sumNumbers = new int[2];

        for (int i = 0; i < numArra.length; i++) {
            for (int j = i + 1; j < numArra.length; j++) {

                if (numArra[i] + numArra[j] == num) {

                    sumNumbers[0] = numArra[i];
                    sumNumbers[1] = numArra[j];

                }
            }
        }
        return sumNumbers;
    }

    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the difference and the index
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // Return null if no solution is found
        return null;
    }
}
