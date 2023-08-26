package ssg_dersler.stringManipulation02;

public class C01_stringManipulation {
    public static void main(String[] args) {
        /*
        subString:ilk girilen indexten baslayarak 2. indexe kadar yazdirir (2. indexdeki dahil degil)eger 2. indexi girmezsem tamamini yazdirir
        trim: bastaki sondaki bosluklari siler
        split:icine girilen karakterden bolmeyi saglar sag veya sol seklinde seceriz(0 ve 1 ile)
        concat:birlestirme islemi yapar
        toUpperCase:tum harfleri buyultur
        toLowerCase:tum harfleri kucultur
        contains:icerme durumunu kontrol eder
        lenght:kelimi ya da cumlenin uzunlugu verir karakter sayisi
        equals:esit mi diye kontrol eder
        equalsIgnoreCase:kucuk buyuk farketmeksizin kontrol eder
        charAt:girilen indexteki karakteri dondurur
        replace:icinde datayi degistirmek icin kullanir
        replaceAll:icinde datayi degistirmek icin kullanir(toplu datalari regex sayesinde degistirebilir)
        startsWith:ne ile basladigini kontrol eder
        endsWith:ne ile bittigi kontrol eder
        isEmpty:bos mu diye kontrol eder(hiclik)
        isBlank:hem bos mu diye kontrol eder bos degilse sadece boslık karakteri var mi diye kontrol eder
        valueOf:String'e donusturmeyi saglar (String)
        indexOf:girilen karakterin bastan baslayarak ilk gordugunun indexini verir
        lastIndexOf:girilen karakterin bastan baslayarak son gordugununkinin indexi verir
         */
        /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
     */
        String isim1=" Ç i ğ  d   e m    ";
        String isim2="  Ö m e r    ";
        String isim3="    O n ur     ";
        int c1=isim1.replace(" ","").length();
        int c2=isim2.replace(" ","").length();
        int c3=isim3.replace(" ","").length();
        System.out.println("karakter sayilari toplami : "+(c3+c2+c1));

        System.out.println(isim1);













    }
}
