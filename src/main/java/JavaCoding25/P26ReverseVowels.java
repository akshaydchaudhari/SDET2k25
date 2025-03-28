package JavaCoding25;

public class P26ReverseVowels {
    public static void main(String[] args) {

        String str = "aeiou"; //uoiea

        System.out.println(revVowels(str));

        String str2 = "Akshay Chaudhari";

        System.out.println(revVowels2(str2));


    }

    private static String revVowels(String str) {

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (!vowels.contains(arr[left] + "")) {
                left++;
            } else if (!vowels.contains(arr[right] + "")) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private static String revVowels2(String str) {

        String[] str1 = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String str2 : str1) {

            char[] arr = str2.toCharArray();

            int left = 0, right = arr.length - 1;

            String vowels = "aeiouAEIOU";

            while (left < right) {

                if (!vowels.contains(arr[left] + "")) {
                    left++;

                } else if (!vowels.contains(arr[right] + "")) {

                    right--;
                } else {

                    char temp = arr[left];

                    arr[left] = arr[right];

                    arr[right] = temp;

                    left++;
                    right--;
                }

            }
            result.append(new String(arr)).append(" ");
        }


        return result.toString().trim();
    }
}
