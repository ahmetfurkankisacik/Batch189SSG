package ssg_dersler.ifelseif02;

import java.util.Scanner;

public class C05_ifElseif {
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
        boolean sesliHarfMi=harf.equals("a") ||
                harf.equals("e")||
                harf.equals("i")||
                harf.equals("o")||
                harf.equals("u");
        if (harf.contains("*")||harf.length()!=1){
            System.out.println("lutfen tek bir harf girerek tekrar deneyiniz");
        } else if (sesliHarfMi) {
            System.out.println("sesli harf");
        }else System.out.println("sessiz harf");


    }
}
