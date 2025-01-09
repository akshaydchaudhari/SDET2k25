package JavaCoding25;

public class P8MinNumber {

    public static void main(String[] args) {
        System.out.println(min(new int[] {1,3,5,7,444,66,77,46,5,77,88}));
        System.out.println(min(new int[] {4,6,7,24,24,87,23,33,88}));


    }

    public static int min(int[] arrNumb) {

        int min = arrNumb[0];

        for(int num : arrNumb) {

            if(min>num) {

                min = num;
            }
        }

        return min;

    }
}
