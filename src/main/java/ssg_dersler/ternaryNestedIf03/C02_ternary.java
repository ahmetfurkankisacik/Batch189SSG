package ssg_dersler.ternaryNestedIf03;

import java.util.Scanner;

public class C02_ternary {
    ////Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi % 2 == 0 ? "sayi cifttir" : "sayi tektir");

        String str=sayi % 2 == 0 ? "sayi cifttir" : "sayi tektir";
        System.out.println(str);
    }
}
