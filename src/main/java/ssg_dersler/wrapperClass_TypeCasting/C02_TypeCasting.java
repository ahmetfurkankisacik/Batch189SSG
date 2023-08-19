package ssg_dersler.wrapperClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
        //kullanicidan aldiginiz bir sayinin ascii degerine gore karakterini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
       char chr1=(char) scan.nextInt();
      // char chr1=(char) sayi;
       System.out.println(chr1);

        char chr='A';//65
        System.out.println(chr+0);//65

    }
}
