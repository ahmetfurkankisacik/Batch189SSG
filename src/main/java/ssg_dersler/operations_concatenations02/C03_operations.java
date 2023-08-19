package ssg_dersler.operations_concatenations02;

public class C03_operations {
    public static void main(String[] args) {
        //assagidaki isleme bakiniz ve sonuclari dondurunuz
        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;//t
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;//f
        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;//F
        System.out.println(sonuc3);

    }

}
