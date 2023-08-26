package ssg_dersler.stringManipulation03;

public class C01_stringManipulation {
    public static void main(String[] args) {
        /*
        lenght:karakter sayisini verir
        subString:ilk girilen indexten baslayarak 2.indexe kadar yazdirir eger 2.index girilmezse ilk indexten sona kadar alır
        charAt:girilen indexteki karakteri dondurur
        contains:icerme durumunu kontrol eder
        replace-replaceAll:icindeki datayi degistirmek icin kullanilir regex kullanarak degistirmek icin replaceAll kullanilir
        trim:bastaki ve sonraki bosluk karakterlerini siler
        split:bolmek icin kullanilir
        equals:esit mi diye kontrol eder =='den farki referans degerine bakmaz
        equalsIgnoreCase:buyuk kucuk farketmeksizin esit mi diye kontrol eder
        toUpperCase:harfleri buyultur
        toLowerCase:harfleri kucultur
        isEmpty:bos mu diye kontrol eder yada hiclik mi diye
        isBlank:bos mu diye kontrol eder eger bos degilse icinde sadece space(bosluk) karakteri var mı dyie kontrol eder
        startsWith:ne ile basladigini kontrol eder
        endsWith:ne ile bittigini kontrol eder
        indexOf:girilen karakterin gordugu ilk indexini bize verir
        lastIndexOf:girilen karakterin son gordugunun indexini verir
        valueOf:variable'lari birbirine donusturmeyi saglar
        concat:birlestirme islemi yapar
         */
        //String str="       e      ";
        //System.out.println(str.isBlank());
        //System.out.println(str.isEmpty());

         /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
     */
        String isim1=" S a l i  h ";
        String isim2=" A  h  m  e  t ";
        String isim3=" F   u r  k a n  ";

        int c1=isim1.replace(" ", "").length();
        int c2=isim2.replace(" ", "").length();
        int c3=isim3.replace(" ", "").length();
        System.out.println("karakter sayilari toplami : "+(c1+c2+c3));


    }
}
