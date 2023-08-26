package ssg_dersler.stringManipulation;

import java.util.Scanner;

public class C02_stringManipulation {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
          odev!! bosluk karakteri varsada hata mesaji verin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email adresinizi giriniz");
        String email= scan.nextLine();
        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol ediniz");
        }
    }
}
