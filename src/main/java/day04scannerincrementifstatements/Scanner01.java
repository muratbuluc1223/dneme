package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi ve Soyadinizi giriniz");
        //nextLine() method u kullanicidan cok kelimeli string almak icin kullanilir
        String fullName = input.nextLine();

        System.out.println("Yasinizi giriniz..");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz..");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz..");
        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz..");
        //next() methodu kullanicidan tek kelimeli string almak icin kullanilir
        String maritalStatus = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);


    }
}
