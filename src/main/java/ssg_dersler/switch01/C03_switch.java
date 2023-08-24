package ssg_dersler.switch01;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme ve kalan Hesaplama
        //yapan basit bir Hesap Makinesi oluşturun:
        double sayi1=9.5;
        int sayi2=7;

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz +,*,/,-,%");
        String operator= scan.next();

        switch (operator){
            case "+":
                System.out.println("sayilarin toplami : "+(sayi1+sayi2));
            break;
            case "*":
                System.out.println("sayilarin carpimi : "+sayi1*sayi2);
                break;
            case "/":
                System.out.println("sayilarin bolumu : "+sayi1/sayi2);
                break;
            case "-":
                System.out.println("sayilarin farki : "+(sayi1-sayi2));
                break;
            case "%":
                System.out.println("bolumunden kalan : "+sayi1%sayi2);
                break;
            default:
                System.out.println("lutfen gecerli bir operator giriniz");
        }



    }
}
