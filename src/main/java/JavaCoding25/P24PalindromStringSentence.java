package JavaCoding25;

public class P24PalindromStringSentence {

    //question asked in DOMO

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();*/

        String str1 = "eye";
        String Str2 = "never odd or even";

        System.out.println(isPal(str1));
        System.out.println(isPal(Str2));
    }

    public static boolean isPal(String str) {

        str = str.replaceAll("\\s", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {

                return false;
            }
            start++;
            end--;

        }
        return true;

    }
}
