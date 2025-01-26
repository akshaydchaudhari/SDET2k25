package JavaCoding25;

public class P19ReverseSpecificString {

    public static void main(String[] args) {

        String input = "Akshay Chaudhari Statate Capgimini global logic adobe";
        String wordToReverse = "Capgimini";

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(wordToReverse)) {
                result.append(new StringBuilder(word).reverse().toString()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Trim the final result to remove any trailing space
        String output = result.toString().trim();
        System.out.println("Output: " + output);
    }
} 