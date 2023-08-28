package ssg;

import java.util.ArrayList;
import java.util.Scanner;

public class slm {
    public static void main(String[] args) {
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (String gun : gunler) {
            System.out.print(gun + " gününün kazancını girin: ");
            double kazanc = scanner.nextDouble();
            gunlukKazanclar.add(kazanc);
        }
        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftalık ortalama kazanç: " + ortalamaKazanc);
        ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, ortalamaKazanc, gunler);
        System.out.println("Ortalamanın üstünde kazanç sağlanan günler: " + ustundeKazancGunleri);
        ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, ortalamaKazanc, gunler);
        System.out.println("Ortalamanın altında kazanç sağlanan günler: " + altindaKazancGunleri);
    }
    public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
        double toplamKazanc = 0;
        for (double kazanc : kazanclar) {
            toplamKazanc += kazanc;
        }
        return toplamKazanc / kazanclar.size();
    }
    public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<Double> kazanclar, double ortalama, ArrayList<String> gunler) {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) > ortalama) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ustundeKazancGunleri;
    }
    public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<Double> kazanclar, double ortalama, ArrayList<String> gunler) {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) < ortalama) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }
        return altindaKazancGunleri;
    }
}
