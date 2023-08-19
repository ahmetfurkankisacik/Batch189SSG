package ssg_dersler.scanner02;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println(isim);
        scan.nextLine();

        System.out.println("lutfen soyIsmini giriniz");
        String soyIsim=scan.next();
        System.out.println(soyIsim);

    }
}
