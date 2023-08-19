package ssg_dersler.ifStatements01;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        //1.yol
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("sayi tektir");
        }

        if (sayi%2==0){//eger
            System.out.println("sayi cifttir");
        }else {//degilse
            System.out.println("sayi tektir");
        }
        }
}
