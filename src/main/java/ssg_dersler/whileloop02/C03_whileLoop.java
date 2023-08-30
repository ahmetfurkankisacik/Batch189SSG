package ssg_dersler.whileloop02;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        while (toplam<=500){
            System.out.println("lutfen toplamak istediginiz pozitif tam sayilari giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin, toplam : "+toplam+" oldu");

    }
}
