package ssg_dersler.ifelseif02;

import java.util.Scanner;

public class C02_ifElseif {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 uzerinden notunuzu giriniz");
        double not= scan.nextDouble();
       // if (not>0&&not<50){
       //     System.out.println("notunuz : D");
       // } else if (not>=50&&not<60) {
       //     System.out.println("notunuz : C");
       // }else if (not>=60&&not<80) {
       //     System.out.println("notunuz : C");
       // } else if (not>=80&&not<=100) {
       //     System.out.println("notunuz A");
       // }else System.out.println("lutfen notunuzu duzgun giriniz");

    if (not>100||not<0){
        System.out.println("lutfen notunuzu duzgun giriniz");
    } else if (not>=80) {
        System.out.println("notunuz : A");
    } else if (not>=60) {
        System.out.println("notunuz : B");
    } else if (not>=50) {
        System.out.println("notunuz : C");
    }else System.out.println("notunuz : D");


    }
}
