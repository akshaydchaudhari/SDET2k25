package LogicalProgram;

public class P1Triangle {

/* 1 2 3 4
 5 6 7
 8 9
 10*/


    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i < 5; i++) {


            for (int j = 0; j < 5 - i; j++) {

                System.out.print(k);
                System.out.print("\t");
                k++;

            }
            System.out.println();


        }

    }
}
