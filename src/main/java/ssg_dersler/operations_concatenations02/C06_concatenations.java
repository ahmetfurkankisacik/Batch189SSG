package ssg_dersler.operations_concatenations02;

import java.util.Scanner;

public class C06_concatenations {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyiniz ve cumlenin
        //bas harfini buyultun eger noktalama isareti yoksa noktalama isareti ekleyin !,.,?
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");//Java kolay
        String cumle= scan.nextLine();
        String str=cumle.toUpperCase().charAt(0)+"";//J
        str=str.concat(cumle.toLowerCase().substring(1));//ava kolay ekledim ustune
        System.out.println(cumle.toUpperCase().charAt(0) + cumle.toLowerCase().substring(1));
        System.out.println(str);
        boolean noktaVarmi=str.endsWith("!")||str.endsWith(".")||str.endsWith("?");

        if (noktaVarmi){
            System.out.println(str);
        }else {
            System.out.println(str+".");
        }




    }
}
