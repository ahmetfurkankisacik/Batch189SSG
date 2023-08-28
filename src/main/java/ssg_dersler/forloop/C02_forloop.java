package ssg_dersler.forloop;

public class C02_forloop {
    public static void main(String[] args) {
        /*
    Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
    virgul olarak ayni satirda yazdirin
        */
        int bas=10;
        int bitis=30;
        for (int i = bas; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i+", ");
            }else System.out.println(i);

        }
    }
}
