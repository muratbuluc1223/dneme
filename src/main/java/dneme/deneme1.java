package dneme;

import java.util.ArrayList;

public class deneme1 {
    public static void main(String[] args) {
        ArrayList<Integer>ages=new ArrayList<>();
        ages.add(5);
        ages.add(6);
        ages.add(12);
        ages.add(21);
        ages.add(54);
        ages.add(51);
        System.out.println(ages);
        for (Integer w:ages) {
            if ( w%2 != 0){

             ages.set(ages.indexOf(w),11);

            }

        }
        System.out.print(ages);
    }
}
