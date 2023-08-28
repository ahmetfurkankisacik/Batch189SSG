package ssg_dersler.forloop;

public class C03_forloop {
    public static void main(String[] args) {
         /*
        soru 3) 0'dan 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print(i+" | ");
            }else System.out.println(i+" ");
        }

        System.out.println("\n-----------------------------");

        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        
    }
}
