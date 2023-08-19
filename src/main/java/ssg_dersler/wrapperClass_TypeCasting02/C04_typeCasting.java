package ssg_dersler.wrapperClass_TypeCasting02;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi=5;
        double sayi2=32.6;
        System.out.println(sayi+sayi2);
        System.out.println((sayi+(int)sayi2));
    }
}
