package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bes basamaklı bir sayı giriniz..");
        int num=input.nextInt();
        int firstTwo=num/1000;

        int lastTwo=num%100;
        System.out.println(firstTwo+lastTwo);

    }
}
