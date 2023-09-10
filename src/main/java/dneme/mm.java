package dneme;

import java.util.ArrayList;
import java.util.Scanner;

public class mm{
    public static void main(String[] args) {
        ArrayList<String> gunler = new ArrayList<>();
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 7 günlük kazançları alın
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + ". gün kazancı girin: ");
            double kazanc = scanner.nextDouble();
            gunler.add("Gün " + i);
            gunlukKazanclar.add(kazanc);
        }

        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftalık ortalama kazanç: " + ortalamaKazanc);

        ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);

        System.out.println("Ortalamanın Üstünde Kazançlar:");
        for (String gun : ustundeKazancGunleri) {
            System.out.println(gun);
        }

        System.out.println("Ortalamanın Altında Kazançlar:");
        for (String gun : altindaKazancGunleri) {
            System.out.println(gun);
        }
    }

    // Ortalama kazancı hesaplayan method
    public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
        double toplamKazanc = 0;
        for (double kazanc : kazanclar) {
            toplamKazanc += kazanc;
        }
        return toplamKazanc / kazanclar.size();
    }

    // Ortalamanın üstünde kazanç günlerini bulan method
    public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalama) {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) > ortalama) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ustundeKazancGunleri;
    }

    // Ortalamanın altında kazanç günlerini bulan method
    public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalama) {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) < ortalama) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }
        return altindaKazancGunleri;
    }
}
