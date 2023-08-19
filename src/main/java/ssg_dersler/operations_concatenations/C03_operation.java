package ssg_dersler.operations_concatenations;

public class C03_operation {
    public static void main(String[] args) {
        //assagidaki isleme bakiniz ve sonuclari dondurunuz
        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;//T
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;//F
        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;//F
        System.out.println(sonuc3);
    }
}
