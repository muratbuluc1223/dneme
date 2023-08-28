package day07strinmanupulation;

import java.util.Scanner;

public class Denme1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen passwordunuzu giriniz");
        String  pwd= input.nextLine();
        boolean lengtControl=pwd.length()>7;
        System.out.println(lengtControl);
        boolean boşluk =pwd.contains("");
        System.out.println("boşluk = " + boşluk);

         boolean uppercase=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("uppercase = " + uppercase);

        boolean lowerCasecontrol=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCasecontrol = " + lowerCasecontrol);
        boolean sayı=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("sayı = " + sayı);
boolean reult=lengtControl&&lowerCasecontrol&&boşluk&&sayı&&uppercase;
        System.out.println("reult = " + reult);
    }
}
