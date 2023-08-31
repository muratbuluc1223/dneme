package dneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deneme3 {
    public static void main(String[] args) {
        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        ArrayList<Integer>ts=new ArrayList<>();
        ts.add(12);
        ts.add(23);
        ts.add(10);
        ts.add(19);


        Collections.sort(ts);
        for (int i = 0; i < ts.size(); i++) {


        }

    }
}
