package JavaCoding25;

public class P6NumberPalindrom {

    public static void main(String[] args) {

        System.out.println(isPal(545));
        System.out.println(isPal(2342));

    }
    public static boolean isPal(int num) {

        int copyofOriginal = num;
        int reversedNumber = 0;
        int reminder;

        while (num>0) {

            reminder = num%10;

            reversedNumber = (reversedNumber*10) + reminder;

            num = num/10;
        }

        return reversedNumber == copyofOriginal;
    }
}
