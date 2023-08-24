package ssg_dersler.switch01;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ay numarasi giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
                //System.out.println("12. ay calisti");
            case 1:
               // System.out.println("1. ay calisti");
            case 2:
              // System.out.println("2. ay calisti");
                System.out.println("kış");
                break;
            case 3:
               // System.out.println("3. ay calisti");
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");

            default:
                System.out.println("lutfne gecerli bir ay no giriniz");
        }
        //aynisini if else ile yapiniz


    }
}
