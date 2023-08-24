package ssg_dersler.ifelseif02;

import java.util.Scanner;

public class C03_ifElseif {
    public static void main(String[] args) {
         /*
        kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("lutfen toplamak icin + carpmak icin * bolmek icin / cıkarmak icin - giriniz");
        String operator= scan.next();
        if (operator.equals("+")){
            System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        } else if (operator.equals("*")) {
            System.out.println("sayilarin carpimi : "+sayi1*sayi2);
        } else if (operator.equals("/")) {
            System.out.println("sayilarin bolumu : "+sayi1/sayi2);
        } else if (operator.equals("-")) {
            System.out.println("sayilarin farki : "+(sayi1-sayi2));
        }else System.out.println("lutfen duzgun bir operator giriniz");

    }
}
