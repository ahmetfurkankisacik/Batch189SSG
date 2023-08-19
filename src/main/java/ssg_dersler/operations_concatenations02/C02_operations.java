package ssg_dersler.operations_concatenations02;

import java.util.Scanner;

public class C02_operations {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz +=,-=,*=,/=,++,--,%=;


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        sayi1=sayi1+sayi2;
        System.out.println(sayi1);
        sayi1+=sayi2;
        System.out.println(sayi1);
        sayi1/=sayi2;//sayi1=sayi1/sayi2;
        System.out.println(sayi1);
        sayi2-=sayi1;
        System.out.println(sayi2);
        sayi2%=sayi1;
        System.out.println(sayi2);
        sayi2*=sayi1;
        System.out.println(sayi2);


    }
}
