package ssg_dersler.scanner02;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz:Ahmet Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi giriniz");
       // System.out.println("lutfen soyIsminizi giriniz");
        String isim= scan.nextLine();
        String soyIsim= scan.next();
        int boslukIndex=isim.indexOf(" ");
        isim=isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1,boslukIndex+1)+isim.split(" ")[1].toUpperCase().charAt(0)+isim.substring(boslukIndex+2);
        System.out.println("Isminiz: "+isim);
        soyIsim=soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1);
        System.out.println("soyIsminiz: "+soyIsim);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz.");




    }
}
