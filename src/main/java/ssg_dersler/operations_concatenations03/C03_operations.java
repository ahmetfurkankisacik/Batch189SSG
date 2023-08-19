package ssg_dersler.operations_concatenations03;

public class C03_operations {
    public static void main(String[] args) {
        //assagidaki isleme bakiniz ve sonuclari dondurunuz //&&,||
        //==: Eşit mi?
        //!=: Eşit değil mi?
        //>: Büyük mü?
        //<: Küçük mü?
        //>=: Büyük veya eşit mi?
        //<=: Küçük veya eşit mi?
        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;//T
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;//F
        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3);





    }
}
