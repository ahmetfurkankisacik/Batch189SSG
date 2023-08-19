package ssg_dersler.scanner03;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hesaplamak istediginiz dairenin yaricapini giriniz");
        double r= scan.nextDouble();
        double toplam= (2*r*Math.PI)+(Math.PI*Math.pow(r,2));
        double cevre=2*r*Math.PI;
        System.out.println("dairenin cevresi : "+cevre);
        System.out.println("dairenin alani : "+(Math.PI*Math.pow(r,2)));
        System.out.println(toplam);

    }

}
