package ssg_dersler.scanner02;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hesaplamak istediginiz dairenin yaricapini giriniz");
        double r= scan.nextDouble();
        System.out.println("dairenin cevresi : "+(2*Math.PI*r));
        System.out.println("dairenin alani : "+(Math.PI*Math.pow(r,2)));
    }
}
