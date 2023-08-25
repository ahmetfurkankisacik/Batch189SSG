package ssg_dersler.ternaryNestedif02;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip 1000 cıkartin yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        //   bir ternary olusturalim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
      //  if (sayi>100){
      //      System.out.println(sayi*sayi);
      //  }else System.out.println("sayi 100'den buyuk olmali");

                           //condition  //evetse    //hayirsa
        //System.out.println(sayi > 100 ? sayi * sayi : "sayi 100'den buyuk olmali");
        Object obje=sayi > 100 ? sayi * sayi : "sayi 100'den buyuk olmali";
        System.out.println(obje);




       // System.out.println(sayi*sayi);//dogru
       // System.out.println("sayi 100'den buyuk olmali");//hayirsa


    }
}
