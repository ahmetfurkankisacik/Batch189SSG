package ssg_dersler.nestedForloop03;

public class C01_nestedForLoop {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
       //System.out.println("* * * * * *\n* * * * * *\n* * * * * *\n* * * * * *\n");
       //for (int i = 1; i <=4 ; i++) {
       //    System.out.println("* * * * * *");
       //}

        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 1; i <=4 ; i++) {//i=satir
            for (int j = 1; j <=6 ; j++) {//j=sutun
                if (i==2&&j==4){
                    System.out.print("! ");
                } else if (i==3&&j==3) {
                    System.out.print("! ");
                }else System.out.print("* ");

            }
            System.out.println();
        }


    }
}
