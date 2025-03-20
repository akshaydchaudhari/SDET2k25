package JavaCoding25;

import java.util.HashMap;
import java.util.Map;

public class P27printDuplicateChar {

    public static void main(String[] args) {

        String str = "akshay chaudhari ";
        printDuplicateCharacter(str);

    }

    private static void printDuplicateCharacter(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {

            if (!Character.isSpaceChar(c)) {

                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }
}
