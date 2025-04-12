package JavaCoding25;

public class P34ExtractLetters {

    public static void main(String[] args) {

        System.out.println(extractLetters("a3k12sh24a4y"));

    }

    public static String extractLetters(String str) {

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch))

                result.append(ch);


        }


        return result.toString();
    }
}
