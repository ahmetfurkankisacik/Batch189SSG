package ssg_dersler.operations_concatenations03;

import java.util.Scanner;

public class C02_operations {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz
        /*
         =: Değer atama
        +=: Toplama ve atama
        -=: Çıkarma ve atama
        *=: Çarpma ve atama
        /=: Bölme ve atama
        %=: kalan ve atama
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();

        double sayi2= scan.nextDouble();
        System.out.println(sayi1);
        System.out.println(sayi2);
        sayi1+=sayi2;//sayi3=sayi1+sayi2
        System.out.println(sayi1);
        sayi2-=sayi1;//sayi2=sayi2-sayi1
        System.out.println(sayi2);
        sayi2*=sayi1;//sayi2=sayi2*sayi1
        System.out.println(sayi2);
        sayi1%=sayi2;//sayi1=sayi1%sayi2
        System.out.println(sayi1);
        sayi2/=sayi1;//sayi2=sayi2/sayi1
        System.out.println(sayi2);





    }
}
