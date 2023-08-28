package day06swichternarystring;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0
    int c=4;
        //condtion  ?  true ise : false ise ;
    int result= c < 0 ?-1*c:c;
        System.out.println(result);



        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.
int a=-13;
int b=-7;
      Object result2= (a>0&&b>0)||(a<0&&b<0)?a*b:"farkli işsaretleri çalıştıramıyorum";
        System.out.println(result2);
      //object javada butun clasların ortak parent(babası)leridir(==> adem gibidir)
        // objectinde parenti yoktur.
        //farklı data tipleri için ortak bir vareible oluşturmak istediğinizde data type olarak object kullanırız,
    }


}
