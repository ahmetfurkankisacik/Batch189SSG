package ssg_dersler.scanner03;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin formulu ucunun carpımı
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenarini giriniz");
        int uzunKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin kisa kenarini giriniz");
        int kisaKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin yukseklik giriniz");
        int yukseklik= scan.nextInt();
        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik);

        System.out.println("lutfen dikdortgenler prizmasinin uzun, kisa kenarini ve yuksekligi giriniz");
        int uzunKenar2= scan.nextInt();
        int kisaKenar2= scan.nextInt();
        int yukseklik2= scan.nextInt();
        System.out.println("prizmanin hacmi : "+uzunKenar2*kisaKenar2*yukseklik2);
    }
}
