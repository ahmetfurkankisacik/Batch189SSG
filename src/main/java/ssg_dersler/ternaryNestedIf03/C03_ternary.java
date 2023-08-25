package ssg_dersler.ternaryNestedIf03;

public class C03_ternary {
    public static void main(String[] args) {
         /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        en az Biri negatifse ve en az biri 0 ise "çarpma nasıl yapılır bilmiyorum"
        */
        int sayi1=0;
        int sayi2=12;
        System.out.println(sayi1 > 0 && sayi2 > 0 ? sayi1 * sayi2 : "carpma nasil yapilir bilmiyorum");

        Object obje=sayi1 > 0 && sayi2 > 0 ? sayi1 * sayi2 : "carpma nasil yapilir bilmiyorum";
        System.out.println(obje);
    }
}
