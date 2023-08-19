package ssg_dersler.operations_concatenations02;

import java.util.Scanner;

public class C01_operations {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("toplamlari : "+(sayi1+sayi2));
        System.out.println("farklari : "+(sayi1-sayi2));
        System.out.println("farklari : "+(sayi2-sayi1));
        System.out.println("carpma : "+(sayi2*sayi1));
        System.out.println("bolme : "+(sayi2/sayi1));
        System.out.println("bolme : "+(sayi1/sayi2));
        System.out.println("birbirin ussunu alma : "+Math.pow(sayi1,sayi2));
        System.out.println("birbirin ussunu alma : "+Math.pow(sayi2,sayi1));



    }
}
