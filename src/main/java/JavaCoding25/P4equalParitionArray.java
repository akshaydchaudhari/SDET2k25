package JavaCoding25;

public class P4equalParitionArray {

    public static void main(String[] args) {


        int[] arr1 = {1, 4, 2, 5, 0};

        System.out.println(findEqualSumPartion(arr1));
    }

    public static int findEqualSumPartion(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;

        for (int num : arr) {
            rightSum += num;
        }
        System.out.println(rightSum);

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return arr[i];
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
