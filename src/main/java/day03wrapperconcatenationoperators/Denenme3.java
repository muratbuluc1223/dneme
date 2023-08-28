package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Denenme3 {
    public static void main(String[] args) {

        //  primitive   :    char    - boolean  - byte - short -  int        - long     - float - double
        //Wrapper Class : Character  - Boolean  - Byte - Short - Integer     - Long     - Float - Double

int n=12;
Integer m=12;
//primitive den wrapper clasa çevirme

//Ornek : Primitive int i wrapper Integer a ceviriniz.(Autoboxing)

       int num=13;
       Integer wrapperNum=num;

        //Ornek :Wrapper Byte i primitive byte a ceviriniz (Unboxing)

        Byte k=19;
        byte primitivek=k;


        // Primitive char i wrapper Character e ceviriniz(Autoboxing)
        char harf='k';

        Character primitive=harf;

        //wrapper Integer i primitive int e ceviriniz (Unboxing)
        Integer sayı=122;
        int cevirme=sayı;

        //Primitive short u wrapper Short a ceviriniz(Autoboxinng)
        short murat=5000;
        Short donustur=murat;
        //Ornek 1: Bir String ve iki integer variable olusturun. String degeri ile ınt larin toplamini console yazdirin

String s="elma";
int a=10;
int b=11;
        System.out.println(s+a+b);
        System.out.println(s+(a+b));
        System.out.println(a+s+b);
        System.out.println(s+a*b);

        int kisiSayisi = 10;
        int paraMiktari = 25;
        System.out.println(paraMiktari/kisiSayisi);


      int ogrenciSayısı=30;
      double ucretMiktari=20;
        System.out.println(ucretMiktari/ogrenciSayısı);

          /*
        2) Java da "Logical Operators" AND ve OR islemler "Logical Operator" lardir

             CAY      AND     KAHVE     SONUC
            true      &&      false     false
            false     &&      true      false
            false     &&      false     false
            true      &&      true      true

            Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
            AND islemi perfectionist tir, bir tane bile false sonucu false yapar

            CAY       OR      KAHVE     SONUC
            true      ||      false     true
            false     ||      true      true
            false     ||      false     false
            true      ||      true      true

            Note :OR (||) isleminde bir tane true sonucu true yapmak icin yeterlidir
            OR isleminde sonucun false olabilmesi icin hersey false olmalidir
 3) NOT operatoru ( ! )  true olani false, false olani true yapar.
            !true  ===> false
            !false ===> true
            !!true ===> true

         4) Comparison (Karsilastirma) Operators
            <,>, <=, >=, == , !=

          NOTE: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz
         */
        boolean first=3<5;//true
        boolean second=2+3!=5;//false
        boolean third=2+3*5>=19;//fase
        System.out.println(first&&second);
        System.out.println(first||second||third);
         /*
        Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denir
        Numeric(sayisal) data typelar  byte  - short  - int -   long -   float -     double

        Note 1: Kucuk data type lerini buyuk data type'larina cevirmeyi java otomatik yapabilir
        Bu isleme AutoWidening (Otomatik Genisletme) denir

        Note 2: Buyuk data type larini kucuk data type'larina cevirmek riskli bir istir
        Java bu riskli isleri otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
        Bu isleme Expilicit Narrowing (Aciktan daraltma)

         */
        //Ornek : byte data type ini int data type ina ceviriniz (Auto Widening)

        byte age=13;
       int ageInt=age;

        long hucre=30000;
        double hucreLong=hucre;
        // Ornek : int data type ini short data type ina ceviriniz.(Explicit Narrowing)
        int weight=313;
        short weightShort=(short) weight;

        float sayma=100000;
        long saymaLong=(long) sayma;

        //1. adim : Scanner Class'tan object olustur
        Scanner input=new Scanner(System.in);

        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz..");

        //3. admi : Uygun method'u kullanarak kullanicinin verdigi data yi memory e yerlestiriniz

        byte ages= input.nextByte();
        System.out.println(ages);











    }


        }



