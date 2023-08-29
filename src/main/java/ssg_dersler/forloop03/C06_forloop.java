package ssg_dersler.forloop03;

public class C06_forloop {
    public static void main(String[] args) {
        //bir string ifadenin tum harflerini alt alta yazdirin
        String str="Java Guze ldir";

        //for (int i = 0; i <= str.length()-1 ; i++) {
        //    System.out.println(str.charAt(i));
        //}
         /*
         Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
         */
        String bosStr="";
        for (int i = 0; i <=str.length()-1; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
                bosStr+=str.charAt(i);
            }else System.out.println(str.charAt(i)+": harfinden birden fazla var");
        }
        System.out.println(bosStr.length());
        //bir String'de tekrar eden elemanlarin tekrarlarinda kurtulun
        String str1="hava bugun cok sıcak";
        String bosStr1="";
        for (int i = 0; i <=str1.length()-1 ; i++) {
           if (!bosStr1.contains(String.valueOf(str1.charAt(i)))){
               bosStr1+=str1.charAt(i);
           }

        }
        System.out.println(bosStr1);

        
    }
}
