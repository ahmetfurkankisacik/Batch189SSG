package ssg_dersler.wrapperClass_TypeCasting;

import java.util.Scanner;

public class C03_TypeCasting {
    public static void main(String[] args) {
        //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
       //char karakter=scan.next().charAt(0);
       //System.out.println((int)karakter);

        int sayi=scan.next().charAt(0);
        System.out.println((char) sayi);

    }
}
