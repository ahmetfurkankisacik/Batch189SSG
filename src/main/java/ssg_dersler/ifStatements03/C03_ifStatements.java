package ssg_dersler.ifStatements03;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {
        /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next();
        String haftaIci="pazartesi sali carsamba persembe cuma";
        String haftaSonu="cumartesi pazar";
        if (haftaIci.contains(gunIsmi)) {
            System.out.println("hafta ici");
        }
        if (haftaSonu.contains(gunIsmi)){
            System.out.println("hafta sonu");
        }
        if (!(haftaSonu.contains(gunIsmi)||haftaIci.contains(gunIsmi))){
            System.out.println("hatali giris yaptınız tekrar deneyiniz");
        }
    }
}
