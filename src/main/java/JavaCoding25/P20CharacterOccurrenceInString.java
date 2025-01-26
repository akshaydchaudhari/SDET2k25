package JavaCoding25;

import java.util.HashMap;
import java.util.Map;

public class P20CharacterOccurrenceInString {

    public static void main(String[] args) {

        countCharacterOccurrence("akshay chaudhari");
    }

    public static void countCharacterOccurrence(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a character array
        char[] strArray = str.toCharArray();

        // Iterate through the character array
        for (char c : strArray) {

            // If the character is not a space, count its occurrence
            if (c != ' ') {
                if (charCountMap.containsKey(c)) {
                    // If the character is already in the map, increment its count
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    // If the character is not in the map, add it with a count of 1
                    charCountMap.put(c, 1);
                }
            }
        }
        // Print the character occurrence
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

            System.out.println("Character :" + entry.getKey() + " - Occurrence: " + entry.getValue());
        }
    }
}
