package ssg_dersler.nestedforloop02;

public class C05_nestedForloop {
    public static void main(String[] args) {
        /*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */
        for (int i = 'a'; i <='e' ; i++) {
            for (char j = 'a'; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
