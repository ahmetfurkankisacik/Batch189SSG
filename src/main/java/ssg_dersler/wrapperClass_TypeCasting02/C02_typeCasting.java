package ssg_dersler.wrapperClass_TypeCasting02;

import java.util.Scanner;

public class C02_typeCasting {
    public static void main(String[] args) {
        //kullanicidan aldiginiz bir sayinin ascii degerine gore karakterini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
       //1. yol
       /*
        int sayi= scan.nextInt();
        char chr=(char)sayi;
        System.out.println(chr);
      */
        //2.yol
        char chr=(char)scan.nextInt();
        System.out.println(chr);






    }
}
