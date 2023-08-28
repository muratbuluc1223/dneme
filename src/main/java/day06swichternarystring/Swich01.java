package day06swichternarystring;

import java.util.Scanner;

public class Swich01 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - DecemberOfMonth
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen başlangiç ayını giriniz");
        int numOfMonth= input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("january");
             case 2:
                System.out.println("february");
             case 3:
                System.out.println("march");
             case 4:
                System.out.println("april");
             case 5:
                System.out.println("may");
             case 6:
                System.out.println("june");
             case 7:
                System.out.println("july");
             case 8:
                System.out.println("agust");
             case 9:
                 System.out.println("septenber");
             case 10:
                System.out.println("octaber");
             case 11:
                System.out.println("novenber");
             case 12:
                System.out.println("decenber");
                break;
            default:
                System.out.println("gecerlibir ay giriniz");
   /*
        Note: switch condition parantezine 1) String, 2)int 3)byte 4) short 5) char kullanabiliriz
              switch condition parantezine 1) long 2)boolean 3) float 4) double kullanilmaz.
         */


    }
}}
