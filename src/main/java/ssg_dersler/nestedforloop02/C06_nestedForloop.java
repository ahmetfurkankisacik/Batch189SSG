package ssg_dersler.nestedforloop02;

public class C06_nestedForloop {
    public static void main(String[] args) {
          /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */
         int satir=10;
        for (int bulunsatir = 1; bulunsatir <=satir ; bulunsatir++) {
            for (int i = satir-bulunsatir; i >=1 ; i--) {
                System.out.print("* ");
            }

            for (int i = 1; i <=bulunsatir ; i++) {
                System.out.print(". ");
            }



            System.out.println();
        }
    }
}
