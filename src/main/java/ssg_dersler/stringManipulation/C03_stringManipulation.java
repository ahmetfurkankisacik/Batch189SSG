package ssg_dersler.stringManipulation;

public class C03_stringManipulation {
    //Bir String değişkeni oluşturunuz
    //ve String değişkenin konsolda boşluk olmayan son
    //karakteri yazdırınız.
    public static void main(String[] args) {
        String str="  Fa  tih   ";
        str=str.trim();
        System.out.println(str.charAt(str.length() - 1));


    }
}
