package ssg_dersler.whileloop02;

import java.util.Random;
import java.util.Scanner;

public class C05_whileLoopV2 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayi;
        int kalanTahminSayisi=7;
        int tahminSayisi=0;
        while (kalanTahminSayisi!=0){

            System.out.println("lutfen tahminde bulumak icin 1-100 arasinda bir tam sayi giriniz");
            kullaniciSayi= scan.nextInt();
            tahminSayisi++;
            if (kullaniciSayi<sayi){
                System.out.println("sayiyi buyult");
            } else if (kullaniciSayi>sayi) {
                System.out.println("sayiyi kucult");
            }else {
                System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz sayi : "+sayi);
                break;
            }
            kalanTahminSayisi--;
            System.out.println("kalan tahmin hakkınız : "+kalanTahminSayisi);
        }
        if (kalanTahminSayisi==0){
            System.out.println("bilgisayarin tuttugu sayiyi bulamadiniz sayi buydu : "+sayi);
        }

    }
}
