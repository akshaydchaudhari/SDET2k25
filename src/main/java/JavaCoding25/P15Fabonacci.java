package JavaCoding25;

public class P15Fabonacci {

    public static void main(String[] args) {

        fib(5);
        fib(3);

    }

    /**
     *  The Fibonacci is a series of numbers where the next number is the sum of the previous two numbers.
     *  The first two numbers of the Fibonacci is 0 followed by 1.
     *  Print n Fibonacci numbers in one line separated by space
     */
    public static void fib(int n) {

        int numOne =0;
        int numTwo =1;

        System.out.print(numOne + " ");
        System.out.print(numTwo + " ");

        for(int i =0; i<n -2; i++ ) {

            int sum = numOne +numTwo;
            System.out.print(sum + " ");

            numOne = numTwo;
            numTwo = sum;
        }
        System.out.println();
    }
}
