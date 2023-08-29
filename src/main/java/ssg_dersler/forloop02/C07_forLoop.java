package ssg_dersler.forloop02;

public class C07_forLoop {
    public static void main(String[] args) {
        /*
        soru 12) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        */
        String str="Java Guzeldir";
        String bosstr="";
        for (int i = 0; i <=str.length()-1; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                bosstr+=str.charAt(i);
            }


        }
        System.out.println(bosstr);

        //Bir String’ de tum karakterleri tek bir kere yazdırmak için kod yazınız.
        String str1="Java Guzeldir";
        str1=str1.toLowerCase();
        String bosstr1="";
        for (int i = 0; i <=str1.length()-1 ; i++) {
            if (!bosstr1.contains(str1.substring(i,i+1))){
                bosstr1+=str1.substring(i,i+1);
            }
        }
        System.out.println(bosstr1);



    }
}
