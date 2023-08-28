package day08Loops;

public class Forloops01 {
    public static void main(String[] args) {

        //Example : Ekrana 25 kere "Hi" yazdiriniz.

        //1.Yol ==> Tavsiye edilmez
      //  System.out.println("Hi");
        //System.out.println("Hi");
       // System.out.println("Hi");
        //System.out.println("Hi");
        //System.out.println("Hi");


        //2. yol
        //a) for loop
        /*
               for ( Baslangic Degeri ; Loop calisma sarti  ;  Artirma / Azaltma     ){
            tekrarlanmasi gereken kodlar yazilir
        }
         */

        // Baslangic Degeri ; Loop calisma sarti  ;  Artirma / Azaltma


        for(    int i=1     ;          i<2                   ;         i++         ){
            System.out.println("Hi.");
        }

        //Example:  11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

for (int sayı=11;sayı<15;sayı++){
    System.out.println(sayı);
}
        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=40;  i>22 ; i--){
           if (i%2==0){
            System.out.println(i);
           }

        }

    }

}
