package ssg_dersler.switch01;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
        //Ayakkabi Boyutu kontrol etmek için Java Programı
        //switch...case ifadesini kullanarak
        //Boyutu icin size ler: small -Medium- Large- Extra Large-
        //35-50
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 35~50 arasi bir ayakkabi numarasi giriniz");
        int ayakkabiNo= scan.nextInt();
        switch (ayakkabiNo){
            case 35:
            case 36:
            case 37:
            case 38:
                System.out.println("small");
                break;
            case 39:
            case 40:
            case 41:
            case 42:
                System.out.println("medium");
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                System.out.println("large");
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                System.out.println("extra large");
                break;
            default:
                System.out.println("lutfen gecerli bir ayakkabi numarasi giriniz");


        }


    }
}
