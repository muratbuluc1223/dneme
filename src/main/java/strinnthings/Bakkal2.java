package strinnthings;

import java.util.ArrayList;
import java.util.Scanner;

import static strinnthings.Bakkal.getOrtalamaninUstundeKazancGunleri;

public class Bakkal2 {
    public static void main(String[] args) {
       /*
Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.*
1Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
2Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
3Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
4Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
5Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
ortalama kazançtan yüksekse o günleri return yap.
6Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
ortalama kazançtan aşağıysa o günleri return yap.
*/
        //1adım
        ArrayList<String> gunler=new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Carsanba");
        gunler.add("Persenbe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        //2 adım
        ArrayList<Double> gunlukKazanclar=new ArrayList<>();
        //3 adım
        Scanner scan=new Scanner(System.in);
        int i=0;
        while (i<gunler.size()){
            System.out.print(gunler.get(i)+" gününün kazancını giriniz  :");
            gunlukKazanclar.add(scan.nextDouble());
            i++;


            System.out.println(getOrtalamaKazanc(gunlukKazanclar));
            double ortalama = getOrtalamaKazanc(gunlukKazanclar);
            System.out.println("Ortalama üstü kazanç günleri: " + getOrtalamaninUstundeKazancGunleri(ortalama, gunlukKazanclar, gunler));
            System.out.println("Ortalama altı kazanç günleri: " + getOrtalamaninAltindaKazancGunleri(ortalama,gunlukKazanclar,gunler));
        }

    }
    public static double getOrtalamaKazanc(ArrayList<Double>kazançlar) {
        Double toplam = 0.0;
        for (int i = 0; i < kazançlar.size(); i++) {
toplam+=kazançlar.get(i);
        }return toplam/kazançlar.size();
    }
    public static ArrayList<String> getOrtalamaninUstundeKazancGünleri(double ort, ArrayList<Double>kazançlar, ArrayList<String> gunler ){
       ArrayList<String>kazançlıgünler=new ArrayList<>();
        for (int i = 0; i <gunler.size(); i++) {
            if (kazançlar.get(i)>ort){
                kazançlıgünler.add(gunler.get(i));
            }


        }return kazançlıgünler;
    }public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(double ort, ArrayList<Double> Kazançlar, ArrayList<String> gunler){
        ArrayList<String>zararlıGunler=new ArrayList<String>();
        for (int i = 0; i < gunler.size(); i++) {

            if (Kazançlar.get(i)<ort){
                zararlıGunler.add(gunler.get(i));
            }

        }
    return zararlıGunler;
}

}


