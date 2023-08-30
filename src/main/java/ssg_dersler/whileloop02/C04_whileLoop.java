package ssg_dersler.whileloop02;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        int sayi=3;
        int toplam=0;
        while (sayi!=0){
            System.out.println("lutfe toplamak istediginiz sayilari giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("sayilarin toplami : "+toplam);

    }
}
