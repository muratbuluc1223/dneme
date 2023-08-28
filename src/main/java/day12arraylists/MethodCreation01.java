package day12arraylists;

public class MethodCreation01 {

    public static void main(String[] args) {
            /*
            Java da method nasil olusturulur?
            ==>main methodun disinda classin icinde olusturulur
            1)Acces Modifier + return type + Method ismi + () + {}
            2)metod oluşturmak methodu çaliştırmak için geçerlidir
             */
//Method call:maim method içinde bir mrthod kullanılmasına method call denir
        int sonuc= toplamaYap(13,12);
        System.out.println(sonuc);

    }//main method burda bitiyor

    //ornek 1 :toplama islemi yapan bir method olusturunuz

public static int toplamaYap(int a,int b){
        return a+b;}


}//class kapanış corly braysı