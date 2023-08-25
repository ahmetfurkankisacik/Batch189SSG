package ssg_dersler.ternaryNestedif02;

import java.util.Scanner;

public class C06_nestedIF {
    public static void main(String[] args) {
         /*
        bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa yasini sorun yasi (15e esit)15'ten buyukse
        kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen annenizden izin aliniz alabilirseniz true alamazsaniz false giriniz");
        boolean izinAldinMi=scan.nextBoolean();
        if (izinAldinMi){
            System.out.println("lutfen yasinizi giriniz");
            int yas= scan.nextInt();
            if (yas>=15){
                //kilosunu almasi odev
                System.out.println("binebilirsiniz");
            }else System.out.println("yasiniz tutmadigi icin binemezsiniz");
        }else System.out.println("lutfen velinden tekrar izin almaya calis");

    }
}
