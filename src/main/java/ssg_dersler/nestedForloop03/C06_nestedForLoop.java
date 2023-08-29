package ssg_dersler.nestedForloop03;

public class C06_nestedForLoop {
    public static void main(String[] args) {
         /*

        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

        */
        int satir=5;
        for (int bulunsatir = 1; bulunsatir <=satir ; bulunsatir++) {
            for (int i = satir-1; i >=bulunsatir ; i--) {
                System.out.print("* ");
            }

            for (int i = 1; i <=bulunsatir ; i++) {
                System.out.print(". ");
            }



            System.out.println();

        }



    }
}
