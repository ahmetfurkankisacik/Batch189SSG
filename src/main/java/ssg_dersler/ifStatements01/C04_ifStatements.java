package ssg_dersler.ifStatements01;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        boolean haftaIciMi=gunIsmi.equals("pazartesi")
                ||gunIsmi.equals("sali")
                ||gunIsmi.equals("carsamba")
                ||gunIsmi.equals("persembe")
                ||gunIsmi.equals("cuma");
        boolean haftaSonuMu=gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi");
        if (gunIsmi.equals("pazartesi")
                ||gunIsmi.equals("sali")
                ||gunIsmi.equals("carsamba")
                ||gunIsmi.equals("persembe")
                ||gunIsmi.equals("cuma")){
            System.out.println("hafta ici");
        }

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
