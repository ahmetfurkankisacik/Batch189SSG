package ssg_dersler.nestedForloop;

import java.util.Scanner;

public class C05_nestedForloop {
    public static void main(String[] args) {
          /*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ilerlemek istediginiz harfi giriniz");
        char harf=scan.next().toLowerCase().charAt(0);
        for (int i = 'a'; i <=harf ; i++) {
            for (int j = 'a'; j <=i ; j++) {
                System.out.print((char) j+" ");
            }
            System.out.println();
        }

    }
}
