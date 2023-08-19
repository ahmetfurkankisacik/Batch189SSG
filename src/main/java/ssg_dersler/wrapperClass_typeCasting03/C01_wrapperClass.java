package ssg_dersler.wrapperClass_typeCasting03;

public class C01_wrapperClass {
    public static void main(String[] args) {
        /*
        primitive datalar    wrapper Classlar
        char          =      Character
        byte          =      Byte
        boolean       =      Boolean
        int           =      Integer
        short         =      Short
        long          =      Long
        float         =      Float
        double        =      Double
         */
       // System.out.println(Integer.MAX_VALUE);
       // System.out.println(Integer.MIN_VALUE);

        int sayi=15;
        double sayi2=sayi;//kucuk kutu buyuk kutu'ya
        System.out.println(sayi2);
        Integer sayi3=sayi;
        System.out.println(sayi3==sayi);//30
        Double sayi4=(double)sayi;




    }
}
