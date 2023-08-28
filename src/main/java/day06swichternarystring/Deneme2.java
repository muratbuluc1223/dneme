package day06swichternarystring;

public class Deneme2 {
    public static void main(String[] args) {

        String s="I love java";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a') {
                break;}
                System.out.print(s.charAt(i));
        }
        System.out.println();
     /*   System.out.println();
        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String s1="Pwd12?Ab";
String bh=s1.replaceAll("[a-z]","");
        System.out.println(bh);*/

        String s1="Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
           char ch=s1.charAt(i);
            if(ch>='a'&&ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }

        }

    }



}