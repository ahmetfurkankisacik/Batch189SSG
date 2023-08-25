package ssg_dersler.ternaryNestedif02;

public class C03_ternary {
    public static void main(String[] args) {
         /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        en az Biri negatifse veya en az biri 0 ise "çarpma nasıl yapılır bilmiyorum"
        */
        int sayi1=0;
        int sayi2=5;
        System.out.println(sayi1 > 0 && sayi2 > 0 ? sayi1 * sayi2 : "çarpma nasıl yapılır bilmiyorum");
    }
}
