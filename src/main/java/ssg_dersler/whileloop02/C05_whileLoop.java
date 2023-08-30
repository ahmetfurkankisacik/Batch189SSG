package ssg_dersler.whileloop02;

import java.util.Random;
import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int tahminSayisi=0;
        int kullaniciSayisi=-1;
        while (sayi!=kullaniciSayisi){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayisi= scan.nextInt();
            if (kullaniciSayisi>sayi){
                System.out.println("sayiyi kucult");
            } else if (kullaniciSayisi<sayi) {
                System.out.println("sayiyi buyult");
            }
            tahminSayisi++;
        }
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz sayi : "+sayi);



    }
}
