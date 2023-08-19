package ssg_dersler.operations_concatenations;

import java.util.Scanner;

public class C01_operation {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        int sayi1= scan.nextInt();//10
        int sayi2= scan.nextInt();
        System.out.println("toplamlari : "+(sayi1+sayi2));
        System.out.println("farklari : "+(sayi1-sayi2));
        System.out.println("farklari : "+(sayi2-sayi1));
        System.out.println("çarpma : "+sayi1*sayi2);
        System.out.println("bolme : "+sayi1/sayi2);
        System.out.println("bolme : "+sayi2/sayi1);
        System.out.println("birbirini kati : "+Math.pow(sayi1,sayi2));
        System.out.println("birbirini kati : "+Math.pow(sayi2,sayi1));


    }
}
