package ssg;

import java.util.ArrayList;
import java.util.Scanner;

public class soru {




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

                for (int i = 0; i < 7; i++) {
                    System.out.print(gunler.get(i) + " gününün kazancını girin: ");
                    double kazanc = scanner.nextDouble();
                    gunlukKazanclar.add(kazanc);
                }

                double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
                System.out.println("Bakkalın ortalama kazancı: " + ortalamaKazanc);

                ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, ortalamaKazanc);
                System.out.println("Ortalamanın üstünde kazanç elde edilen günler: " + ustundeKazancGunleri);

                ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, ortalamaKazanc);
                System.out.println("Ortalamanın altında kazanç elde edilen günler: " + altindaKazancGunleri);
            }

            public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
                double toplam = 0;
                for (double kazanc : kazanclar) {
                    toplam += kazanc;
                }
                return toplam / kazanclar.size();
            }

            public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<Double> kazanclar, double ortalama) {
                ArrayList<String> ustundeGunler = new ArrayList<>();
                for (int i = 0; i < kazanclar.size(); i++) {
                    if (kazanclar.get(i) > ortalama) {
                        ustundeGunler.add(ustundeGunler.get(i));
                    }
                }
                return ustundeGunler;
            }

            public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<Double> kazanclar, double ortalama) {
                ArrayList<String> altindaGunler = new ArrayList<>();
                for (int i = 0; i < kazanclar.size(); i++) {
                    if (kazanclar.get(i) < ortalama) {
                        altindaGunler.add(altindaGunler.get(i));
                    }
                }
                return altindaGunler;
            }
        }


