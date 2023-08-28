package ssg_dersler.forloop;

public class C07_forloop {
    public static void main(String[] args) {
       // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        int sayi=7;
        int carpim=1;
        for (int i = sayi; i >0 ; i--) {
            carpim*=i;


        }

        System.out.println(sayi+"! = "+carpim);
    }
}
