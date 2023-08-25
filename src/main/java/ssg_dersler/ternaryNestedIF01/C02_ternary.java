package ssg_dersler.ternaryNestedIF01;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        String str=sayi % 2 == 0 ? "cift sayidir" : "tek sayidir";
        System.out.println(str.contains("cift") ? "o zmn sayi gercekten cift" : "o zmn sayi gercekten tek olabilir");
        System.out.println(str);


    }
}
