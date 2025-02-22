package JavaCoding25;

public class P23RepeatCharacters {

    public static void main(String[] args) {

        String input = "d2g3m1t2a1";

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
}
