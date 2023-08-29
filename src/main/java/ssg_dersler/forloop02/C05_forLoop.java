package ssg_dersler.forloop02;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
         /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi<100&&sayi>0){
        for (int i = 1; i <=sayi ; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        }else System.out.println("lutfen 100'den kucuk ve 1den buyuk bi sayi giriniz");
    }
}
