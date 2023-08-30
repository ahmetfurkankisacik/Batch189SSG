package ssg_dersler.whileloop01;

public class C01_whileLoop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n********************************");
        int sayi=5;

        while (sayi<=10){
            System.out.print(sayi+" ");
            sayi++;
        }
    }
}
