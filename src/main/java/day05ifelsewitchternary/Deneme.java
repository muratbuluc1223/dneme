package day05ifelsewitchternary;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        //Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner input=new Scanner(System.in);

            System.out.println("Lütfen bir gün giriniz");
        String günVeSayı= input.next();
        if (günVeSayı.equalsIgnoreCase("sunday")){
            System.out.println(1);
        }else if (günVeSayı.equalsIgnoreCase("monday")){
            System.out.println(2);
        }else if (günVeSayı.equalsIgnoreCase("Tuesday")){
            System.out.println(3);
        }else if (günVeSayı.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        }else if (günVeSayı.equalsIgnoreCase("thursday")){
            System.out.println(5);
        }else if (günVeSayı.equalsIgnoreCase("friday")){
            System.out.println(6);
       }else if (günVeSayı.equalsIgnoreCase("saturday")){
            System.out.println(7);


        }else {
            System.out.println("lütfen geçerli bir sayı giriniz");
        }


    switch (günVeSayı.toLowerCase()){
        case "sunday":
            System.out.println(1);
            break;
        case"monday":
            System.out.println(2);
            break;
        case"tuesday" :
            System.out.println(3);
            break;
        case "wesnesday":
            System.out.println(4);
            break;
        case"thursday":
            System.out.println(5);
            break;
        case "firiday":
            System.out.println(6);
            break;
        case "saturday":
            break;
        default:
            System.out.println("LÜtfen gecerli gün sayısı giriniz");
    }


    }

    }








