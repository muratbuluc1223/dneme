package day20collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

       long t1=System.nanoTime();


        TreeSet<String>emails=new TreeSet<>();
    emails.add("k@gmail.com");
    emails.add("a@gmail.com");
    emails.add("z@gmail.com");
    emails.add("c@gmail.com");
    emails.add("u@gmail.com");
    emails.add("p@gmail.com");
    emails.add("t@gmail.com");
        System.out.println(emails);//[a@gmail.com, c@gmail.com, k@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, z@gmail.com]

        long t2=System.nanoTime();


        //2. yol
        HashSet<String>emailhs=new HashSet<>();
        emailhs.add("k@gmail.com");
        emailhs.add("a@gmail.com");
        emailhs.add("z@gmail.com");
        emailhs.add("c@gmail.com");
        emailhs.add("u@gmail.com");
        emailhs.add("p@gmail.com");
        System.out.println(emailhs);
TreeSet<String>emailhsts=new TreeSet<>(emailhs);
        System.out.println(emailhsts);

        long t3=System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}
