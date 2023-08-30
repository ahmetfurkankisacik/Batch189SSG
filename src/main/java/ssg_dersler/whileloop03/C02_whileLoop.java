package ssg_dersler.whileloop03;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir tamsayi alip
        //  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfem bir tam sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n********************************");
        int i=1;
        while (i<=sayi){
            System.out.print(i+" ");
            i++;
        }
    }
}
