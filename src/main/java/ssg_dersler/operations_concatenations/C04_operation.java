package ssg_dersler.operations_concatenations;

public class C04_operation {
    public static void main(String[] args) {
        int sayi1=40;
        int sayi2=60;
        int sayi3=30;

        System.out.println(sayi1>30&&sayi1<70);//T

        System.out.println(sayi2>=60&&sayi3!=70);//T

        System.out.println(sayi3<100||sayi2>80);//T

        System.out.println(sayi3!=sayi2&&sayi2>sayi1);//T

        System.out.println(sayi2<30||sayi2>50&&sayi2==70);//F
    }
}
