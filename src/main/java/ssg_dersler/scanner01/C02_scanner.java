package ssg_dersler.scanner01;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen islem yapmak icin ilk sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen islem yapmak icin ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        System.out.println("sayilarin farki : "+(sayi1-sayi2));
        System.out.println("sayilarin carpimi : "+sayi1*sayi2);
    }
}
