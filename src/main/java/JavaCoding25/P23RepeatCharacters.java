package JavaCoding25;

public class P23RepeatCharacters {

    public static void main(String[] args) {

        String input = "d2g3m1t2a1"; //ddgggmtta

        System.out.println(repeatCharacters(input));


    }

    public static String repeatCharacters(String input) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            int num = 0;

            while (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {

                num = num * 10 + (input.charAt(++i) - '0');

            }
            for (int j = 0; j < num; j++) {

                result.append(ch);

            }
        }

        return result.toString();
    }


    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            if (i + 1 >= input.length()) break; // In case of odd length string

            char character = input.charAt(i);
            int count;

            try {
                count = Character.getNumericValue(input.charAt(i + 1));
            } catch (NumberFormatException e) {
                // If next character is not a number, assume count = 1
                count = 1;
                i--; // Adjust index to process this character again
            }

            // Append the character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(character);
            }
        }

        return result.toString();
    }
}
