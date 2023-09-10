package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*
        1) set'tler tekrarsız elemanları depolamak iin kullanılır
        2)3 tane set claa vardır
         a)HashSet Class
           Hash benzesiz id oluşturma  tekniğidir bu tekniğe Hashing technice denir
           Hashset elemaları erasgele sıralar
           HashSet elemanları  sıralamadığından çok hızlıdır
           HashSet null eleman kabuş eder

           b)LikedHashSet
           LikedhashSet ler elemanları sizin verdiğiiniz sıraya göre dizer

           c)TreeSet class
         TreeSet elemanları natural order a göre dizerler
         bu nedenle çok yavaştır en yavaş settir
         */
        HashSet<String>hs=new HashSet<>();
        hs.add("sinan");
        hs.add("kerem");
        hs.add("tuba");
        hs.add("onur");
        System.out.println(hs);//[sinan, kerem, tuba, onur]

        hs.add("tuba");//Tekrarlı eleamaları eklerken hata vermez ama sadece bir kez ekler
        System.out.println(hs);

        hs.add(null);
        System.out.println(hs);

        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);

        //lhs.retainAll ortak elemanlarını alır ve lhs ye yazdırır
        lhs.retainAll(ls);
        System.out.println(lhs);//[313, 19]
        System.out.println(ls);//[313, 19, 17, 11]


        TreeSet<Character>ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.subSet('G', 'U'));//[G, R]

    }
}
