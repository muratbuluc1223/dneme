package day02variables;

public class Variables01 {
    public static void main(String[] args) {
        //veriable nasıl oluşturulur//
        //data Type +Variable +Assigmentoperetor(atama operatörü +Vearible değeri +noktalı virgül
        int           age                   =                        135                        ;
        System.out.println(age);
         /*
       Java da temelde iki tip data vardir
       1)primitive data type:
            char, boolean, byte, short, int, long, float, double

       2)non-primitive data type:
            String
            String toplama= ahmet;
        */
        //1) primitive data types
        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        // Data Type + Variable name + Assignment Operator(Atama operatoru) + Variable Degeri + noktali virgul
        //Note : char data type inda degerler her zaman tek tirnak icine konulmalidir//
        char isminIlkHarfi = 'A' ;
        //boolean data type:  1 bit
//boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
//Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
boolean emeklimi =false;

//byte data type :
//tam sayilar icindir hafizada 1 byte yer kaplar
//byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
//Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.//
        byte ogrenciYasi = 15;
        //short data type:
//tam sayilar icindir hafizada 2 byte yer kaplar
//short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
//Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.//
        short siteNufusu= 1200;
//int data type:
//tam sayilar icindir hafizada 4 byte yer kaplar
//int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
//Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 147 ;
        //long data type:
//tam sayilar icindir hafizada 8 byte yer kaplar
//long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
//Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        long hucreSayısı =9223372036854775807L;
        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        // float oluşturduğunuzda sonuna f veya F koymalısınız cunkü java ondalıktakini otamatik olarak kabul eder
 float gomleFiyati=299.99F;

        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double weightCell=0.000000015;
        System.out.println(weightCell);

        }
    }



