package strinnthings;

import java.util.ArrayList;
import java.util.List;

public class task1 {
     /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
     public static void main(String[] args) {
         List<Integer> sayıListesi=new ArrayList<>();
   sayıListesi.add(5);
   sayıListesi.add(2);
   sayıListesi.add(2);
   sayıListesi.add(2);
   sayıListesi.add(5);

   int sayılarınKaresi=0;
         for (int sayı:sayıListesi) {
             sayılarınKaresi+=sayı*sayı;

         }
         System.out.println("sayılarınKaresi = " + sayılarınKaresi);
     }

     }

