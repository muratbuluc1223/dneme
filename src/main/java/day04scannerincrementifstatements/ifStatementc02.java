package day04scannerincrementifstatements;

import java.util.Scanner;

public class ifStatementc02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("çift sayi...");}
        if (num%2 !=0){
            System.out.println("tek sayi..");}


        if (num%2==0){System.out.println("çift sayi...");
        }else{  System.out.println("tek sayi..");}
    }



    }

