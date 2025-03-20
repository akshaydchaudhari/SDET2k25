package JavaCoding25;

public class P4PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(29));
        System.out.println(isPrime(20));

        System.out.println(isPrime1(29));

    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int num) {

        if (num <= -1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {

            if (num % i == 0) {

                return false;
            }


        }
        return true;

    }
}
