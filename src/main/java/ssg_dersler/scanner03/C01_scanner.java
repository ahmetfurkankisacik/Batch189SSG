package ssg_dersler.scanner03;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println("isminiz: "+isim);
        scan.nextLine();
        System.out.println("lutfen soyIsminizi giriniz");
        String soyIsim= scan.next();
        System.out.println("soy isminiz : "+soyIsim);

    }
}
