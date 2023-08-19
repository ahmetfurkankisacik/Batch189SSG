package ssg_dersler.ifStatements01;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str=scan.next().toLowerCase();
        str=str.replaceAll("[^a-zA-Z]","*");
        boolean sesliHarfMi=str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u");

        if (sesliHarfMi){
            System.out.println("sesli harftir");
        }
        if (!sesliHarfMi&&!str.contains("*")&&str.length()==1){
            System.out.println("sessiz harftir");
        }
        if (str.length()!=1||str.contains("*")){
            System.out.println("lutfen duzgun bir harf giriniz");
        }


    }
}
