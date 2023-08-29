package ssg_dersler.nestedforloop02;

public class C02_NestedForloop {
    public static void main(String[] args) {
        //asagidaki sekli yazdirin
        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */

        for (int satir = 1; satir <=4 ; satir++) {
            for (int sutun = 1; sutun <= 6; sutun++) {
if (satir==2&&sutun==4){
    System.out.print("! ");
} else if (satir==3&&sutun==3) {
    System.out.print("! ");
}else System.out.print("* ");
            }
            System.out.println();
        }


    }
}
