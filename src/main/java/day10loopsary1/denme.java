package day10loopsary1;

import java.util.Arrays;
import java.util.Scanner;

public class denme {
    public static void main(String[] args) {
    /*     Scanner sacn =new Scanner(System.in);
   Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.

        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı

         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir işçi bu işi kaç günde yapar");
        int çalışmaGünü= sacn.nextInt();
        System.out.println("bu iste kac kisi calisacak");
        int elemansayisi= scan.nextInt();

        System.out.println("işi bitirme süresi " +çalışmaGünü/elemansayisi  +"  gündür");


        // TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        //bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı soyadınızı giriniz");
        String adsoyad = scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        System.out.println("lütfen salona devam edecğiniz süreyi giriniz");
        int aylık= scan.nextInt();
        System.out.println("adsoyad= "+adsoyad+"\n"+"yas= "+(yas)+"\n"+"kilo= "+(kilo)+"\n"+"boy= "+(boy));
         System.out.println("toplam ücret = "+"$"+aylık*20);
        */
        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333

        Scanner sccan=new Scanner(System.in);
        System.out.println("lütfen a sayısını giriniz");
        double a= sccan.nextDouble();
        System.out.println("lütfen b sayısını giriniz");
        double b= sccan.nextDouble();
        System.out.println("lütfen c sayısını giriniz");
        double c= sccan.nextDouble();
        double toplam=((a*a)-(b*b))/(3*c);
        System.out.println("sonuç : "+toplam);
*/

       /*

         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)

         ORNEK:

         INPUT      : Kilo: 71
                           Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        double kitleİndeksiniz=kilo/(boy*boy);
        System.out.println("kitleİndeksiniz = " + kitleİndeksiniz);
      */
           /*
        bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa

         yasini sorun yasi (15e esit)15'ten buyukse

        kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Annenizden izin aldınız mı");
                String izin= scan.next();
                if (izin.equalsIgnoreCase("evet")){
                    System.out.println("Lütfen yaşınızı giriniz");
                    int yas= scan.nextInt();
                    if (yas>=15){
                        System.out.println("Lütfen kilonuzu giriniz");
                        int kilo= scan.nextInt();
                        if (kilo<100){
                            System.out.println("Girebilirsiniz....");
                        }else {
                            System.out.println("Kilonuz 100 den fazla olduğu için giremezsin");
                        }
                    }else {
                        System.out.println("Yaşınız 15 ten küçük olduğu için giremezsiniz");
                    }
                }else {
                    System.out.println("annenizden izin almadığınız için giremezsiniz");
                }


    } }

