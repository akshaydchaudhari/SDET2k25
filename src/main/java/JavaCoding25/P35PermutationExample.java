package JavaCoding25;

public class P35PermutationExample {


    public static void main(String[] args) {
        String number = "456";
        permute("", number);
    }

    // Recursive function to generate permutations
    public static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }


}