package day20collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo=new LinkedList<>();
        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[sut, et, yumurta, peynir]
        depo.remove();
        System.out.println(depo);//[et, yumurta, peynir]
        System.out.println(depo.peek());
        System.out.println(depo);
        depo.clear();
        System.out.println(depo);//[]
        System.out.println(depo.poll());//null
        //System.out.println(depo.element());
        System.out.println(depo.peek());

        Queue<String>wareHouse=new PriorityQueue<>();
        wareHouse.add("milk");
        wareHouse.add("Meat");
        wareHouse.add("egg");
        wareHouse.add("orange");
        wareHouse.add("tomato");
        System.out.println(wareHouse);//[Meat, milk, egg, orange, tomato]


    }
}
