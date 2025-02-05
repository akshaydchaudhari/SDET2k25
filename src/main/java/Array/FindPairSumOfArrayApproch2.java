package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairSumOfArrayApproch2 {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 7, 2, 3, 6, 4, 5};
        int target = 9;

        List<int[]> pairs = twoSumAllPairs(nums, target);

        // Print all pairs
        for (int[] pair : pairs) {
            System.out.println("Indices: [" + pair[0] + ", " + pair[1] + "]");
        }

    }

    public static List<int[]> twoSumAllPairs(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in the map, add the pair to the result list
            if (map.containsKey(complement)) {
                result.add(new int[]{map.get(complement), i});
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        return result;
    }
}
