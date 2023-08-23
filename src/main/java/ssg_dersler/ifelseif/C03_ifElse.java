package ssg_dersler.ifelseif;

import java.util.Arrays;
import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {
        /*
        kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("lutfen toplamak icin + carpmak icin * bolmek icin / cikarmak icin -");
        String operator= scan.next();

        if (operator.equals("+")){
            if ((sayi1+sayi2)%1==0){
                System.out.println("sayilarin toplami : "+(int)(sayi1+sayi2));
            }else System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        } else if (operator.equals("*")) {
            System.out.println("sayilarin carpimi : "+sayi1*sayi2);
        } else if (operator.equals("/")) {
            System.out.println("sayilarin bolumu : "+sayi1/sayi2);
        } else if (operator.equals("-")) {
            System.out.println("sayilarin farki : "+(sayi1-sayi2));
        }else System.out.println("lutfen duzgun bir operator seciniz");
        char arr[]={'a','A'};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
