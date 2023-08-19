package ssg_dersler.variable03;

public class C01_variable {
    public static void main(String[] args) {

        /*
        primitive
        int
        char
        boolean
        byte
        short
        long
        double
        float
         */
        /*
        non-primitive
        String
        Scanner
        Wrapper classlar
         */
         String                str                =                          "Javaya bugun basladik"         ;
         //data turu         //variable ismi    //assignment operator      //  data degeri            //cumlenin sonu
        //iki tane sayi iceren variable olusturalim
        int sayi1=15;
        short sayi2=20;
        System.out.println(sayi1);
        System.out.println(sayi2);
        //bu iki sayiyi toplayip yeni bir variable'a atayiniz
        int toplamSayi=sayi1+sayi2;
        System.out.println(sayi1+sayi2);


        System.out.println((sayi1+sayi2)/2);

    }
}
