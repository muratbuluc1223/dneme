package day20collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */
         LinkedList<String>list=new LinkedList<>();
         list.add("Mehmet");
         list.add("Ahmet");
          list.add("Mehmet");
         list.add("Onur");
         list.add("Kübra");
         list.add("Tuba");
         list.add("Duygu");
        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.add(1,"Zafer");
        System.out.println(list);//[Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.addFirst("onur");
        System.out.println(list);//[onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.addLast("İbrahim");
        System.out.println(list);//[onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, İbrahim]

       // list.remove("Mehmet");
        System.out.println(list);//[onur, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, İbrahim]

      //  list.removeLastOccurrence("Mehmet");
     //   System.out.println(list);
        list.removeFirstOccurrence("Mehmet");
        System.out.println(list);
 /*
 * Retrieves, but does not remove, the head (first element) of this list.
Returns:
the head of this list, or null if this list is empty
 *
 * */
        System.out.println(list.peek());
        System.out.println(list);

       /*Retrieves and removes the head (first element) of this list.
        Returns:the head of this list,or null if this list is emty
        */
        System.out.println(list.poll());
        System.out.println(list);


        //note peek() ile element () metodu ilk elelmanı silmeden size verir
        //peek() ile
        System.out.println(list.element());
        System.out.println(list);

        //pool ie pop ikisede ilk elemanı siler ve size verir
        //ama poll() lists boş olduğunu size null verir pop() ise hata verir.

        System.out.println(list.pop());
        System.out.println(list);
    }
}
