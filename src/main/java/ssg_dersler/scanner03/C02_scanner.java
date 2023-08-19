package ssg_dersler.scanner03;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        System.out.println("sayilarin farki : "+(sayi1-sayi2));
        System.out.println("sayilarin carpim : "+sayi1*sayi2);


    }
}
