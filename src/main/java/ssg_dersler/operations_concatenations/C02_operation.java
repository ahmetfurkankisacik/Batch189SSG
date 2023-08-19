package ssg_dersler.operations_concatenations;


import java.util.Scanner;

public class C02_operation {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        int sayi1= scan.nextInt();//10
        int sayi2= scan.nextInt();
        System.out.println(sayi1);
        System.out.println(sayi2);
        sayi1/=sayi2;
        sayi1+=4;
        System.out.println(sayi1);
        sayi2-=sayi1;
        System.out.println(sayi2);
        sayi2%=sayi1;
        System.out.println(sayi2);



    }
}
