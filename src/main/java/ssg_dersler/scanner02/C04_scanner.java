package ssg_dersler.scanner02;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenari giriniz");
        int uzunKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin kisa kenari giriniz");
        int kisaKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin yuksekligini giriniz");
        int yukseklik= scan.nextInt();
        System.out.println("prizmanin hacmi : "+(uzunKenar*kisaKenar*yukseklik));
        //2. yol

        System.out.println("lutfen dikdortgenler prizmasinin uzun, kısa kenarini ve yuksekligini giriniz");
        int uzunkenar2= scan.nextInt();
        int kisakenar2= scan.nextInt();
        int yukseklik2= scan.nextInt();
        System.out.println("prizmanin hacmi : "+(uzunkenar2*kisakenar2*yukseklik2));

    }
}
