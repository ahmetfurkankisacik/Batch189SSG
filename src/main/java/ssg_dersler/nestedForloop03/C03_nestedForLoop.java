package ssg_dersler.nestedForloop03;

public class C03_nestedForLoop {
    public static void main(String[] args) {
                /*
                10987654321
                1098765432
                109876543
                10987654
                1098765
                109876
                10987
                1098
                109
                10
                */
        int satir=5;
        for (int i = 1; i <=satir ; i++) {//i=satir sayisi
            for (int j = satir; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
