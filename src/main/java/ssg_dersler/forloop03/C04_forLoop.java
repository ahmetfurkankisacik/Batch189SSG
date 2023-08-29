package ssg_dersler.forloop03;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0&&sayi<=100) {
            for (int i = 1; i <= sayi&&sayi<100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else System.out.println("lutfen gecerli bir tamsayi gir");


    }
}
