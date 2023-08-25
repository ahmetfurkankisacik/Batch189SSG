package ssg_dersler.ternaryNestedif02;

import java.util.Scanner;

public class C05_nestedIf {
    public static void main(String[] args) {
        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas>=18&&yas<65){
            System.out.println("lutfen kilonuzu giriniz");
            double kilo= scan.nextDouble();
            if (kilo>=50){
                System.out.println("kan verebilirsiniz lutfen asagidaki formu doldurunuz");
            }else System.out.println("kilonuz tutmadigi icin kan veremezsiniz");
        }else System.out.println("yasiniz tutmadigi icin kan veremezsiniz");
    }
}
