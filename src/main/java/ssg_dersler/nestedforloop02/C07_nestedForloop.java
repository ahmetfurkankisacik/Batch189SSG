package ssg_dersler.nestedforloop02;

public class C07_nestedForloop {
    public static void main(String[] args) {
        /*
          *
         * *
        *****
       *     *
      *       *
         */
        int satir=5;
        for (int bulunsatir = 1; bulunsatir <=satir ; bulunsatir++) {
            for (int bosluksayisi = satir-bulunsatir; bosluksayisi >=1 ; bosluksayisi--) {
                System.out.print(" ");
            }

            for (int yildizsayisi = 1; yildizsayisi <=2*bulunsatir-1 ; yildizsayisi++) {
                if (yildizsayisi==1||bulunsatir==satir-2||yildizsayisi==2*bulunsatir-1){
                    System.out.print("*");
                }else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
