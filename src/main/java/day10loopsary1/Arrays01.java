package day10loopsary1;

import java.util.Arrays;

public class Arrays01 {
       public static void main(String[] args) {


//Array nasıl oluşturul

     String stdName[]=new String[5];


//toSitring() metodunu kullanmadan sadece array  ismini yazdırırsanızz java size o arrey in adresini vriri
           //arreye elaman oluşturma
           stdName[0]="ali";
           stdName[1]="murat";
           stdName[2]="fatma";
           stdName[3]="kemal";
           stdName[4]="ersin";
           System.out.println(Arrays.toString(stdName));
           //Array den specific bir eleman nasil alinir?
           System.out.println(stdName[1]);//murat);

           //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
           //           icerdigi karakter sayilari toplamini ekrana yazdirin.
           //           icerdigi karakter sayilari toplamini ekrana yazdirin.

           String cities[] = new String[5];

           cities[0] = "Bayburt";
           cities[1] = "Sivas";
           cities[2] = "Denizli";
           cities[3] = "Adana";
           cities[4] = "Ankara";
           System.out.println(Arrays.toString(cities));
           //Note : length string lerde parantezli (method) , arraylerde ise parantezsiz (method degil) kullanilir
           //1. yol
           int totalChar = 0;

           for (int i = 0; i < cities.length; i++) {
               totalChar = totalChar + cities[i].length();
           }
           System.out.println(totalChar);

           //2.yol : for - each loop (enhanced loop)

           int sum = 0;

           //[Bayburt, Sivas, Denizli, Adana, Ankara]
           for (String m : cities) {

               sum = sum + m.length();

           }
           System.out.println(sum);
       }

  }
