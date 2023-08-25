package ssg_dersler.switch03;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme ve kalan Hesaplama
        //yapan basit bir Hesap Makinesi oluşturun:
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz +,*,/,-,%");
        char operator=scan.next().charAt(0);//
        switch (operator){
            case '+':
                System.out.println("sayilarin toplami : "+(sayi1+sayi2));
                break;
            case '*':
                System.out.println("sayilarin carpimi : "+sayi1*sayi2);
                break;
            case '/':
                System.out.println("sayilarin bolumu : "+sayi1/sayi2);
                break;
            case '-':
                System.out.println("sayilarin farki : "+(sayi1-sayi2));
                break;
            case '%':
                System.out.println("birbirine bolumunden kalani : "+sayi1%sayi2);
                break;
            default:
                System.out.println("lutfen gecerli bir operator giriniz");
        }



    }
}
