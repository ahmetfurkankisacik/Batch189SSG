package ssg_dersler.stringManipulation03;

public class C03_stringManipulation {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String str="  J   a    v   a       ";
        System.out.println(str.charAt(str.length() - 1));

        //System.out.println(str.replace(" ", "").charAt(str.replace(" ","").length() - 1));
        str=str.replace(" ","");
        System.out.println(str);//java
        System.out.println(str.charAt(str.length()-1));
    }
}
