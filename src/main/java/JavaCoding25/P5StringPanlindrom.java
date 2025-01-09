package JavaCoding25;

public class P5StringPanlindrom {

    public static void main(String[] args) {

        System.out.println(isPal("madam"));
        System.out.println(isPal("civic"));
        System.out.print(isPal("apple"));
    }

    public static boolean isPal(String str) {

        int start =0;
        int end = str.length()-1;

        while (start<end) {

            if(str.charAt(start) != str.charAt(end)) {

                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
