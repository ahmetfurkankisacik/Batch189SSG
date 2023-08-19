package ssg_dersler.wrapperClass_typeCasting03;

import java.util.Scanner;

public class C03_typeCasting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        byte sayi1=(byte) scan.nextInt();//-128//127
        System.out.println(sayi1);//-68


    }
}
