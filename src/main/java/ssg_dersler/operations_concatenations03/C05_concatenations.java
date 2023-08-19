package ssg_dersler.operations_concatenations03;

import java.util.Scanner;

public class C05_concatenations {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyiniz ve cumlenin
        //bas harfini buyultun eger//odev noktalama isareti yoksa noktalama isareti ekleyin//endsWith();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");//Hava cok sicak
        String str= scan.nextLine();
        String str1=str.toUpperCase().charAt(0)+"";
        str1=str1.concat(str.toLowerCase().substring(1));

        System.out.println(str.toUpperCase().charAt(0) + str.toLowerCase().substring(1));
        System.out.println(str1);


    }
}
