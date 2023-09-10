package strinnthings;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        //scanner 01
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir  işçinin işi kaç günde bitirdiğini yazınız ");
        int birişçbirişiBitirmesuresi= scan.nextInt();
        System.out.println("lütfen çalişam işçi sayısını giriniz");
        int çalışanİşçiSayısı= scan.nextInt();
        System.out.println("Bir işçi işi kaç günde bitirmektedir?  "+birişçbirişiBitirmesuresi);
        System.out.println("Toplam kaç işçi çalışacak?             "+çalışanİşçiSayısı);
        System.out.println("İşin bitme süresi                      "+1*birişçbirişiBitirmesuresi/çalışanİşçiSayısı);




    }

}
