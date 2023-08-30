package ssg_dersler.whileloop01;

import java.util.Random;
import java.util.Scanner;

public class C05_whileLoop {
    // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
    // Random rnd=new Random();
    // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
    //kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int tahminSayisi=5;
        int kullaniciSayi=-1;
        while (kullaniciSayi!=sayi){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi= scan.nextInt();
            if (kullaniciSayi>=1&&kullaniciSayi<=100){
                if (kullaniciSayi<sayi){
                    System.out.println("sayiyi buyult");
                } else if (kullaniciSayi>sayi) {
                    System.out.println("sayiyi kucult");
                }
            }else System.out.println("ben sana 1-100 arasinda bir sayi gir dedim!!!");
            tahminSayisi++;
        }
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz sayi : "+sayi);
    }

}
