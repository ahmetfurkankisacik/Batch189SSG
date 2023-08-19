package ssg_dersler.wrapperClass_TypeCasting;

public class C01_wrapperClass {
    public static void main(String[] args) {
        /*
        byte            Byte
        short           Short
        long            Long
        float           Float
        double          Double
        int             Integer
        char            Character
        boolean         Boolean
         */

        //System.out.println(Byte.MIN_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        int sayi=15;

        double sayi2=sayi;
        System.out.println(sayi2);
        Integer sayi3=sayi;
        System.out.println(sayi+sayi3.doubleValue());
        System.out.println(sayi+sayi3.toString());
        String str=sayi3.toString();//String olarak sayilari bu sekilde cevirebiliriz
        System.out.println(str+11);
        Double sayi4=sayi3.doubleValue();
        System.out.println(sayi4);








    }



}
