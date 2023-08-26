package ssg_dersler.stringManipulation;

public class C01_stringManipulation {
    public static void main(String[] args) {
        /*
        replace-replaceAll: icindeki datayi degistirmeyi saglar
        trim: bastaki ve sondaki bosluklari silmeye yarar
        toLowerCase:butun harfleri kucuk harf yapar
        toUpperCase:butun harfleri buyuk harf yapar
        split:icine girilen karakterde bolup sag veya sol seklide secim yaptırır(0 sol)(1 sag)
        contains:icerme durumunu kontrol eder
        equals-(==):esit mi diye kontrol eder (== :  hem adrese hem degere bakar)
        equalsIgnoreCase:buyuk kucuk farketmeksizin esit mi kontrol eder
        subString:ilk girilen indexten ikinci(ikinci dahil degil) indexe kadar olan degeri dondurur,eger ikinci indexi girmezsek sonuna kadar alır
        startsWith:ne ile basladigini kontrol eder
        endsWith:ne ile bittigini kontrol eder
        length:uzunlugu kontrol eder(toplam karakter)
        indexOf:girilen karakterin ilk gordugunun indexini dondurur
        lastIndexOf:girilen karakter son gordugunun indexini verir
        concat:birlestirme islemi yapar
        isBlank:hem bos mu diye bos degilse sadece bosluk karakteri var mi diye kontrol
        isEmpty:bos mu diye kontrol eder(hiclik)
        charAt():girilen indexteki karakteri dondur
        valueOf():String'i baska variable'lara cevirmeyi saglar
         */
        /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
     */
        String isim1=" A  h m e t ";
        String isim2=" A y t  e n ";
        String isim3=" E   b r u ";

        int c1=isim1.replace(" ","").length();
        int c2=isim2.replace(" ","").length();
        int c3=isim3.replace(" ","").length();
        System.out.println("karakter sayilari toplami :"+(c1+c2+c3));












    }
}
