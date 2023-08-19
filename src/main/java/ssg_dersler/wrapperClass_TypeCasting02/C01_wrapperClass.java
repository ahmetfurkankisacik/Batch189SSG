package ssg_dersler.wrapperClass_TypeCasting02;

public class C01_wrapperClass {
    public static void main(String[] args) {

    /*
    char          Character
    int           Integer
    boolean       Boolean
    double        Double
    float         Float
    short         Short
    long          Long
    byte          Byte
    */
      //  System.out.println(Byte.MAX_VALUE);
      //  System.out.println(Short.MIN_VALUE);
      //  System.out.println(Double.MAX_VALUE);
      //  System.out.println(Integer.MAX_VALUE);


        int sayi=15;
        double sayi2=sayi;
        System.out.println(sayi2);
        Integer sayi3=sayi;
        String str=sayi3.toString();
        //System.out.println(str+100);
        System.out.println(sayi+sayi3.doubleValue());
        Double sayi4=sayi3.doubleValue();
        Float sayi5=sayi4.floatValue();
        System.out.println(sayi5);
        System.out.println(sayi4);



    }
}
