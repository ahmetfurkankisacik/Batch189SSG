package ssg_dersler.ternaryNestedif02;

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
        System.out.println("lutfen bir harf giriinz");
        String harf= scan.next().toLowerCase();
        harf=harf.replaceAll("[^a-zA-Z]","*");
        boolean sesliHarfMi= harf.equals("a") ||
                harf.equals("e") ||
                harf.equals("i") ||
                harf.equals("o") ||
                harf.equals("u");
        if (harf.length()==1&&!harf.contains("*")){
            System.out.println(sesliHarfMi ? "sesli harftir" : "sessiz harftir");

        }else System.out.println("yanlis ya da fazla harf girdiniz");


    }

}
