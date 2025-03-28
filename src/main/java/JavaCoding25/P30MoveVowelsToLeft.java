package JavaCoding25;

public class P30MoveVowelsToLeft {

    public static void main(String[] args) {

        System.out.println(MoveVowelsToLeft("automation"));
        System.out.println(MoveVowelsToLeft("hello"));
        System.out.println(MoveVowelsToLeft("java"));

        System.out.println(moveVowelsToLeft("automation"));
        System.out.println(moveVowelsToLeft("hello"));
        System.out.println(moveVowelsToLeft("java"));

    }

    public static String MoveVowelsToLeft(String str) {

        StringBuilder Vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (isVowelsChar(c)) {
                Vowels.append(c);
            } else {
                consonants.append(c);
            }
        }
        return Vowels.append(consonants).toString();
    }

    public static boolean isVowelsChar(char c) {

        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static String moveVowelsToLeft(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                // Swap vowel from right to left
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}
