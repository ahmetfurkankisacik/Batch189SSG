package ssg_dersler.stringManipulation02;

public class C03_stringManipulation {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String str="       Bi   l a   l         ";
        //str=str.trim();
        //System.out.println(str);
        //System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.trim().charAt(str.trim().length() - 1));
        //bi l a l//8 lenght son karakterin indexi 7


    }
}
