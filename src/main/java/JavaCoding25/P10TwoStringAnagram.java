package JavaCoding25;

import java.util.Arrays;

public class P10TwoStringAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram1("listen", "silent"));
        System.out.println(isAnagram("triangle", "internal"));
        System.out.println(isAnagram("anagram", "nagaram"));

    }

    public static boolean isAnagram(String str, String str1) {

        if (str == null || str1 == null || str.length() != str1.length()) {
            return false;
        } else {
            char[] arrStr = str.toCharArray();
            char[] arrStr1 = str1.toCharArray();

            Arrays.sort(arrStr);
            Arrays.sort(arrStr1);

            return Arrays.equals(arrStr, arrStr1);

        }
    }

    public static boolean isAnagram1(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {

            count[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {

            count[ch - 'a']--;
        }
        for (int i = 0; i <= 25; i++) {

            if (count[i] != 0) {

                return false;
            }

        }
        return true;
    }
}
