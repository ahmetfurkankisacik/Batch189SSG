package ssg_dersler.scanner03;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
      //kullanicidan tek bir karakter alip yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tek bir karakter giriniz");
        char character=scan.next().charAt(0);
        System.out.println(character);
    }
}
