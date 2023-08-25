package ssg_dersler.ternaryNestedIF01;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf= scan.next().toLowerCase();
        harf=harf.replaceAll("[^a-zA-Z]","*");

        harf=harf.replaceAll("[aeiou]","e");

       if (harf.length()==1&&!harf.contains("*")){
           System.out.println(harf.equals("e") ? "sesli harftir" : "sessiz harftir");

       }else System.out.println("yanlış ya da fazla harf girdiniz");





    }
}
