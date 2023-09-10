package strinnthings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {
    /* TASK :
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

    //1Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    public static void main(String[] args) {
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

       // 2Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Double> gunlukKazanclar = new ArrayList<>();

        //3Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i<gunler.size()){
            System.out.println(gunler.get(i)+" günün kazancını giriniz...");
            gunlukKazanclar.add(scan.nextDouble());
            i++;
        }
        System.out.println("Ortalama Kazanç: " + getOrtalamaKazanc(gunlukKazanclar));
        double ortalama = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama üstü kazanç günleri: " + getOrtalamaninUstundeKazancGunleri(ortalama, gunlukKazanclar, gunler));
        System.out.println("Ortalama altı kazanç günleri: " + getOrtalamaninAltindaKazancGunleri(ortalama,gunlukKazanclar,gunler));
    }
    //4Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın
    public static Double getOrtalamaKazanc(List<Double> kazanclar){
        Double toplam = 0.0;
        for (int i = 0; i < kazanclar.size(); i++) {
            toplam = toplam+kazanclar.get(i);
        }
        return toplam/kazanclar.size();
    }

    //5Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //ortalama kazançtan yüksekse o günleri return yap.
    public static List<String> getOrtalamaninUstundeKazancGunleri(double ort, List<Double> kazanclar, List<String> gunler){
        List<String> kazancUstuGunler = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if (kazanclar.get(i)>ort) {
                kazancUstuGunler.add(gunler.get(i));
            }
        }
        return kazancUstuGunler;
    }

    //6Adım :getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //ortalama kazançtan aşağıysa o günleri return yap.
    public static List<String> getOrtalamaninAltindaKazancGunleri(double ort, List<Double> kazanclar, List<String> gunler){
        List<String> kazanAltıGunler = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if (kazanclar.get(i)<ort) {
                kazanAltıGunler.add(gunler.get(i));
            }
        }
        return kazanAltıGunler;
    }
}

