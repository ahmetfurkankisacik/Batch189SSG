package ssg_dersler.forloop02;

import java.util.Scanner;

public class C03_forloop {
        /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=10 ; i++) {
           if (i<10){
               System.out.println(sayi+" X "+i+" =  "+i*sayi);
           }else System.out.println(sayi+" X "+i+" = "+i*sayi);
        }
    }
}
