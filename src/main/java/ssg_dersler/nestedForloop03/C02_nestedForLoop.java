package ssg_dersler.nestedForloop03;

public class C02_nestedForLoop {
    public static void main(String[] args) {
           /*
        1 den girilen sayiya kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
        Beklenen çıltı:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910
         */
        int sayi=7;
        for (int i = 1; i <=sayi ; i++) {//i=satir
            for (int j = 1; j <=i ; j++) {//j=sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
