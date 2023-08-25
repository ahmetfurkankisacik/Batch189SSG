package ssg_dersler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorular {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name and surname..");
        String name=input.next();
        System.out.println(input.nextLine());
        System.out.println("please enter surname");
        String surname =input.next();

        System.out.println("please enter age..");
        int age =input.nextInt();

        System.out.println("please enter weight..");
        float weight =input.nextFloat();

        System.out.println("Please enter height..");
        float height =input.nextFloat();

        System.out.println("salona devam edilecek süre");
        int mounth =input.nextInt();
        System.out.println("Pay=$"+(mounth*20));
    }


   }
