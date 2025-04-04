package JavaCoding25;

public class P32QuestionMarks {

    public static void main(String[] args) {

        System.out.println(questionMarks("arrb6???4xxbl5???eee5")); // Output: true
        System.out.println(questionMark("aa6?9"));                 // Output: false
        System.out.println(questionMark("acc?7??sss?3rr1??????5"));// Output: true
        System.out.println(questionMark("6???4xxbl5"));

    }

    public static String questionMark(String str) {

        int questionMarkCount = 0;
        int sum = 0;
        boolean foundValidPair = false;
        boolean firstNumberPair = false;

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {

                int currentNumber = Character.getNumericValue(currentChar);

                if (firstNumberPair) {

                    sum += currentNumber;

                    if (sum == 10) {

                        if (questionMarkCount == 3) {

                            foundValidPair = true;
                        } else {

                            return "false";
                        }
                    }

                    sum = currentNumber;
                    questionMarkCount = 0;
                } else {
                    sum = currentNumber;
                    firstNumberPair = true;
                }
            } else if (currentChar == '?' && firstNumberPair) {

                questionMarkCount++;
            }
        }
        return foundValidPair ? "true" : "false";
    }

    public static Boolean questionMarks(String str) {

        int questionMarkCount = 0;
        int sum = 0;
        boolean foundValidPair = false;
        boolean firstNumberPair = false;
        int NofoundValidPair = 0;

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {

                int currentNumber = Character.getNumericValue(currentChar);

                if (firstNumberPair) {

                    sum += currentNumber;

                    if (sum == 10) {

                        if (questionMarkCount == 3) {

                            foundValidPair = true;
                            NofoundValidPair++;
                        } else {

                            return false;
                        }
                    }

                    sum = currentNumber;
                    questionMarkCount = 0;
                } else {
                    sum = currentNumber;
                    firstNumberPair = true;
                }
            } else if (currentChar == '?' && firstNumberPair) {

                questionMarkCount++;
            }
        }
        System.out.println(NofoundValidPair);
        return foundValidPair ? true : false;
    }
}
