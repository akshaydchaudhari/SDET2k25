package JavaCoding25;

public class P28UpperCaseAbbreviation {

    public static void main(String[] args) {
        String str = "Akshay Chaudhari is giving interview for Coforge";
        System.out.println(getUpperCaseAbbreviation(str));


    }

    public static String getUpperCaseAbbreviation(String str) {

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (Character.isUpperCase(word.charAt(0))) {

                result.append(word.charAt(0)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
