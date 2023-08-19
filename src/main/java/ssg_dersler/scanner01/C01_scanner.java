package ssg_dersler.scanner01;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println(isim);
        System.out.println("burasi ikinci veriyi kullanmak icin : "+scan.nextLine());//dummpy
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.next();
        System.out.println(soyisim);








    }
}
