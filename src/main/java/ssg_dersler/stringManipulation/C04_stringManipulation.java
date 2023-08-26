package ssg_dersler.stringManipulation;

public class C04_stringManipulation {
    public static void main(String[] args) {
        /*Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
        en sinirlayici durum hangisi : iki kelimeyi icermesi
        en sinirlayici olmayan durum : ikisini icermemesi
         */
        String cumle="dunya buyucuk,java kucucuk";
        System.out.println(cumle.indexOf("buyucuk"));
        cumle=cumle.toLowerCase();

    //    if (cumle.contains("buyuk")&&cumle.contains("kucuk")){
    //        System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");
    //    } else if (cumle.contains("kucuk")) {
    //        System.out.println(cumle);
    //    } else if (cumle.contains("buyuk")) {
    //        System.out.println(cumle.toUpperCase());
    //    }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
    }
    //bir string ifadedeki tum harfleri tekrarsiz seklinde yazdirin
}
