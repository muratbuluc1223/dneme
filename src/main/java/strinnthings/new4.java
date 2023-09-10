package strinnthings;

import java.util.Scanner;

public class new4 {
    public static void main(String[] args) {
        /*
//scanner 04
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
                Ipucu : Vucut
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
                ORNEK:
        INPUT      : Kilo: 71
        Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
                */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz  :");
        int kilo= scan.nextInt();
        System.out.print("Lütfen boyunuzu metre cinsinden  giriniz   :");
        double boy = scan.nextDouble();

        double indeks=kilo/(Math.pow(boy,2));
        System.out.println("Boy kio indexsiniz  :"+indeks);


    }
}
