package ssg_dersler.switch03;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo= scan.nextInt();
        //int kis[]={12,1,2};


        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkBahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonBahar");
                break;
            default:
                System.out.println("lutfne gecerli bir ay no giriniz");
        }


    }
}
