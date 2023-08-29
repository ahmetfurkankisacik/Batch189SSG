package ssg_dersler.nestedforloop02;

public class C04_nestedForloop {
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
        int sayi=10;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = sayi; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
