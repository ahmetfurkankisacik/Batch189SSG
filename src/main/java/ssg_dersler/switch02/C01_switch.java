package ssg_dersler.switch02;

import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfem kacinci ay oldugunu giriniz");
        int ayNo= scan.nextInt();
    //    if (ayNo==1){
    //        System.out.println("ocak");
    //    } else if (ayNo==2) {
    //        System.out.println("subat");
    //    } else if (ayNo==3) {
    //        System.out.println("mart");
    //    } else if (ayNo==4) {
    //        System.out.println("nisan");
    //    } else if (ayNo==5) {
    //        System.out.println("mayis");
    //    } else if (ayNo==6) {
    //        System.out.println("haziran");
    //    } else if (ayNo==7) {
    //        System.out.println("temmuz");
    //    } else if (ayNo==8) {
    //        System.out.println("agustos");
    //    } else if (ayNo==9) {
    //        System.out.println("eylul");
    //    } else if (ayNo==10) {
    //        System.out.println("ekim");
    //    } else if (ayNo==11) {
    //        System.out.println("kasim");
    //    } else if (ayNo==12) {
    //        System.out.println("aralik");
    //    }else System.out.println("lutfen gecerli bir ay no giriniz");

        switch (ayNo){
            case 1:
                System.out.println("ocak");
            break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("yanlis bir ay no girdiniz");
        }



    }

}
