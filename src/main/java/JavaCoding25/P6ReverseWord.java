package JavaCoding25;

public class P6ReverseWord {
    public static void main(String[] args) {

        System.out.println(revWords("Apple banana kiwi"));
        System.out.println(revWords("I am the best"));

    }

    public static String revWords(String str) {

        StringBuilder res = new StringBuilder();

        String[] words = str.split(" ");

        for(int i =words.length-1; i>=0; i--) {

            res.append(words[i]).append(" ");
        }
        return res.toString().trim();

    }
}
