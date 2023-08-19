package ssg_dersler.wrapperClass_TypeCasting;

public class C04_TypeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi=17;
        double sayi1=5.7;
        Double sayi2=sayi1;
        System.out.println(sayi+sayi1);

        System.out.println(sayi+sayi2.intValue());

    }
}
