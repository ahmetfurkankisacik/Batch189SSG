package ssg_dersler.forloop;

import java.util.Scanner;

public class C05_forloop {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0&&sayi<=100){
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
          }
        }else System.out.println("lutfen 100'den kucuk veya 0'dan buyuk bir sayi giriniz");
    }
}
