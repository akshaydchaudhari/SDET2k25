package JavaCoding25;

public class P1ReverseString {

    public static void main(String[] args) {

        System.out.println(revString("global"));

    }

    public static String revString(String str) {

        String rev = "";

        for(int i= str.length()-1; i>=0; i--) {

            rev = rev + str.charAt(i);
        }
        return rev;
    }

  /*  public  static  String revStr1(String rev) {

       StringBuilder sb = new StringBuilder();

       for(char ch : rev.toCharArray()) {

           sb.append(rev);

       }

    }*/

}
