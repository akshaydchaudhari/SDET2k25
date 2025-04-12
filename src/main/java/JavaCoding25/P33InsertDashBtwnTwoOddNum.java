package JavaCoding25;

public class P33InsertDashBtwnTwoOddNum {
    public static void main(String[] args) {

        System.out.println(addDashBetweenTwoOddNumber("56730"));
    }


    public static String addDashBetweenTwoOddNumber(String str) {


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            sb.append(str.charAt(i));

            if (i < str.length() - 1 && isOdd(str.charAt(i)) && isOdd((str.charAt(i + 1)))) {

                sb.append("-");


            }
        }


        return sb.toString();
    }

    private static boolean isOdd(char c) {

        int num = Character.getNumericValue(c);
        return num % 2 != 0;
    }


}
