package day06swichternarystring;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
String s="java is easy";
int slengt=s.length();
        System.out.println(slengt);
          char ilkSAyı=s.charAt(0);
        System.out.println(ilkSAyı);

        char sonSayı=s.charAt(s.length()-1);
        System.out.println(sonSayı);
        String secili=s.substring(5,7);
        System.out.println(secili);


        String s2=s.substring(8,12);
        System.out.println(s2);
    boolean sözcük=s.endsWith("easy");
        System.out.println("sözcük");
        String is=s.substring(5,7);
        System.out.println(is);
        String easy=s.substring(8,12);
        System.out.println(easy);


    }


}
