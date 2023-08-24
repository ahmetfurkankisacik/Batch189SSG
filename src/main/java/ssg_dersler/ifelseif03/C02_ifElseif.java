package ssg_dersler.ifelseif03;

import java.util.Scanner;

public class C02_ifElseif {
    public static void main(String[] args) {
        //kullanicidan aldiginiz sayinin pozitif negatif ya da notr olur olmadigini kontrol ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0){
            System.out.println("sayi pozitiftir");
        } else if (sayi<0) {
            System.out.println("sayi negatiftir");
        }else {
            System.out.println("sayimiz 0'dir");
        }


    }
}
