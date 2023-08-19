package ssg_dersler.wrapperClass_TypeCasting;

public class C05_TypeCasting {
    public static void main(String[] args) {
        int sayi=500;
        byte sayi1=(byte) sayi;//-128/127=256
        System.out.println(sayi1);//-12
        int sayi2=sayi1;
        System.out.println(sayi2);


    }
}
