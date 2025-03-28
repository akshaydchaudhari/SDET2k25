package Array;

import java.util.HashMap;
import java.util.Map;

public class characterCountreplace {

    public static void main(String[] args) {

        String str = "Automation";
        System.out.println(transFormingString(str));  //OutPut: 2u22m22i2n

    }

    public static String transFormingString(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toLowerCase().toCharArray()) {

            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : str.toLowerCase().toCharArray()) {

            if (charCountMap.get(ch) > 1) {

                result.append(charCountMap.get(ch));

            } else {

                result.append(ch);
            }

        }
        return result.toString();
    }
}
