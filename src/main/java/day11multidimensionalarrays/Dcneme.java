package day11multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Dcneme {
    public static void main(String[] args) {
      //  Scanner scan=new Scanner(System.in);

      /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.

        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı

         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

     /*   Scanner scan=new Scanner(System.in);
        System.out.println("bu iste kac kisi calisacak");
      int elemansayisi= scan.nextInt();


        System.out.println(10/elemansayisi);


      */


        // TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        //bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.

      /*  Scanner scan= new Scanner(System.in);
        System.out.println("lutfen adinizi soyadiniz giriniz");
        String adsoyad= scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        byte yas= scan.nextByte();

        System.out.println("litfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("kac ay devam edecceksiniz");
        int ay= scan.nextInt();

        System.out.println("kullanici bilgileri");
        System.out.println("adiniz soyadini "+adsoyad+"\n"+"yasiniz "+yas+"\n"+"boyunuz "+boy);
        System.out.println("toplam ucretiniz ="+ay*20);


       */

        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("3 farkli sayisini giriniz");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();
        double result = (a * a) - (b * b);
        result /= c * 3;
        System.out.println(result);



        /*

         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)

         ORNEK:

         INPUT      : Kilo: 71
                           Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23
             */



/*
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();

        System.out.println("lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        double result = kilo /(boy*boy);

        System.out.println(result);


 */

         /*
        bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa

         yasini sorun yasi (15e esit)15'ten buyukse

        kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
        */


        Scanner scan =new Scanner(System.in);
        System.out.println("annenizden izin aldiniz mi");
        String izin= scan.next();

        if (izin.equalsIgnoreCase("evet")){

            System.out.println("lutfen yasinizi giriniz");


            int yas= scan.nextInt();
            if (yas>=15){
                System.out.println("lutfen kilonuzu girniz");
                double kilo= scan.nextDouble();
                if (kilo<100){
                    System.out.println("girebilirsiniz");
                }else {
                    System.out.println("kilonuz 100 den fazla giremezsiz");
                }
            } else {
                System.out.println("yasiniz 15 ten kucuk giremezsiniz");

            }
        } else {
            System.out.println("hayir giremezsiniz");
        }

    }
    }
