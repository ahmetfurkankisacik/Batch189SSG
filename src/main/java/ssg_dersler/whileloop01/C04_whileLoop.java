package ssg_dersler.whileloop01;

import java.util.Scanner;

public class C04_whileLoop {
    // kullanicidan toplamak istedigi sayilari alin
    // ve kullanici 0'a basincaya kadar devam edin
    // kullanici 0'a bastiginda
    // girdigi tum sayilarin toplamini yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hesaplama merkezine hosgeldiniz lutfen devam etmek icin 0 disinda bir sayi giriniz 0'a basincaya kadar toplmaya devam edicek");
        int sayi= scan.nextInt();
        int toplam=0;
        while(sayi!=0){
            toplam+=sayi;
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayi= scan.nextInt();

        }
        System.out.println("sayilarin toplami : "+toplam);
        //5
        //10
        //15=30








    }
}
