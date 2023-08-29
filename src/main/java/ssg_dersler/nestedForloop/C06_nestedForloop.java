package ssg_dersler.nestedForloop;

public class C06_nestedForloop {
    public static void main(String[] args) {
        /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */

        int satir=5;
        for (int bulunSatir = 1; bulunSatir <=satir ; bulunSatir++) {

            for (int i = satir-bulunSatir; i >=1 ; i--) {
                System.out.print("* ");
            }

           for (int i = 1; i <=bulunSatir ; i++) {
               System.out.print(". ");
           }
            System.out.println();
        }



    }
}
