package ssg_dersler.operations_concatenations;

import java.util.Scanner;

public class C06_concatenation {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyiniz ve cumlenin
        //bas harfini buyultun eger noktalama isareti yoksa noktalama isareti ekleyin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");//ali topu at
        String str= scan.nextLine();
        String str1=str.toUpperCase().charAt(0)+"";
        str1=str1.concat(str.toLowerCase().substring(1));
        //System.out.println(str1);
        //System.out.println(str.toUpperCase().charAt(0) + str.toLowerCase().substring(1));
        //?!.
       boolean noktaVarmi= str1.endsWith(".")||str1.endsWith("!")||str1.endsWith("?");
       if (noktaVarmi){
           System.out.println(str1);
       }else {
           System.out.println(str1 + ".");
       }



    }
}
