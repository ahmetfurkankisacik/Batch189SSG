package ssg_dersler.whileloop03;

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
        //kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        int kalanTahminSayisi=5;
        int kullaniciSayi=-1000;
        int tahminSayisi=0;
        while (sayi!=kullaniciSayi){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi = scan.nextInt();
            if (kullaniciSayi>=1&&kullaniciSayi<=100) {

                if (kullaniciSayi < sayi) {
                    System.out.println("sayiyi buyult");
                } else if (sayi < kullaniciSayi) {
                    System.out.println("sayiyi kucult");
                }
                tahminSayisi++;
            }else System.out.println("hatali bir sayi girdiniz lutfen 1-100 arasinda bir sayi giriniz");
        }
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz sayi : "+sayi);
    }
}
