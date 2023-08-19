package ssg_dersler.ifStatements02;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {
         /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        boolean haftaIciMi=gunIsmi.equals("pazartesi")
                ||gunIsmi.equals("sali")
                ||gunIsmi.equals("carsamba")
                ||gunIsmi.equals("persembe")
                ||gunIsmi.equals("cuma");
        boolean haftaSonuMu=gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi");
        if (haftaIciMi){
            System.out.println("hafta ici");
        }
        if (haftaSonuMu){
            System.out.println("hafta sonu");
        }
        if (!(haftaSonuMu||haftaIciMi)){
            System.out.println("lutfen duzgun bir gun ismi giriniz");
        }





    }
}
