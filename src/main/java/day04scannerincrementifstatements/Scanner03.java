package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input=new Scanner(System.in);

        System.out.println("Dikdörtgenin kisa kenar uzunluğınu giriniz...");
        float shortSide=input.nextShort();
        System.out.println("dikdörtgenin uzun kenarını giriniz...");
        float longside=input.nextFloat();

        System.out.println("Alan="+(shortSide*longside));
        System.out.println("cevre= "+(2*shortSide+2*longside));

    }
}
