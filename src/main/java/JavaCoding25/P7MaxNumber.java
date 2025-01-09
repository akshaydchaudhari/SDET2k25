package JavaCoding25;

public class P7MaxNumber {

    public static void main(String[] args) {

        System.out.println(max(new int[] {1,3,5,7,444,66,77,46,5,77,88}));
        System.out.println(max(new int[] {4,6,7,24,24,87,23,33,88}));
    }

    public static int max(int[] arrNum) {

        int max = arrNum[0];

        for(int num : arrNum) {

            if(max<num){

                max= num;
            }
        }

        return max;

    }

}


