package ssg_dersler.ifStatements02;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
         /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String karakter= scan.next().toLowerCase();
        karakter=karakter.replaceAll("[^a-zA-Z]",",");
        boolean sesliHarf=karakter.equals("a")||
                karakter.equals("e")||
                karakter.equals("i")||
                karakter.equals("o")||
                karakter.equals("u");
        if (sesliHarf){
            System.out.println("sesli harf");
        }
        if (!sesliHarf&&!karakter.contains(",")&&karakter.length()==1){
            System.out.println("sessiz harf");
        }
        if (karakter.contains(",")||karakter.length()!=1){
            System.out.println("lutfen tek bir harf giriniz");
        }

    }
}
