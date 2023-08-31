package dneme;

import java.util.ArrayList;

public class deneme2 {
    public static void main(String[] args) {
        //Tekearlı elemanı olan listten sadece tekrarsız elemanları olan bir list elde edin
        //[J,a,v,a,v]==>[J,a,v]
        ArrayList<Character>tekKelimeAlma=new ArrayList<>();
        tekKelimeAlma.add('J');
        tekKelimeAlma.add('a');
        tekKelimeAlma.add('v');
        tekKelimeAlma.add('a');
        tekKelimeAlma.add('v');
        ArrayList<Character>newtka=new ArrayList<>();
        for (Character w:tekKelimeAlma) {
            if (!newtka.contains(w)){
                newtka.add(w);
            }


        }
        System.out.println(newtka);
        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);//[Manisa, Nigde, Tokat, Van]

        for (int i = 0; i <r.size() ; i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
            i--;
            }


        }
        System.out.println(r);
}}
