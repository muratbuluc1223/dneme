package day05ifelsewitchternary;

import java.util.Scanner;

public class İfStatement02 {
    public static void main(String[] args) {
        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunuzu giriniz");
        byte num=input.nextByte();
        if (num==1){
            System.out.println("sunday");
        } else if (num==2) {
            System.out.println("monday");}
        else if (num==3) {
            System.out.println("tuesday");}
        else if (num==4) {
            System.out.println("Wednesday");}
        else if (num==5) {
            System.out.println("Thursday");}
        else if (num==6) {
            System.out.println("Firiday");}
        else if (num==7) {
            System.out.println("Saturday");}
        else{
            System.out.println("hatalı giriş yaptınız. Lütfen 1-7 arasında bir sayı yazınız..7,1");



    }
    }
}
