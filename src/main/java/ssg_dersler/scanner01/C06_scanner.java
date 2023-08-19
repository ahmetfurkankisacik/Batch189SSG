package ssg_dersler.scanner01;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz: Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyIsminizi giriniz");
        String soyIsim= scan.nextLine();
        int boslukIndex=isim.indexOf(" ");
        System.out.println("Isminiz: "+isim.toUpperCase().charAt(0)+isim.substring(1,boslukIndex+1).toLowerCase()+isim.split(" ")[1].toUpperCase().charAt(0)+isim.substring(boslukIndex+2).toLowerCase());
        System.out.println("SoyIsminiz: "+soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1).toLowerCase());



    }
}
