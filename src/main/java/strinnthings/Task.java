package strinnthings;

import java.util.Scanner;

public class Task{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String kelime = "";  // Kelimenin başlangıçta boş olacağını varsayalım
            int oyuncu1Puan = 0;
            int oyuncu2Puan = 0;
            boolean devam = true;

            while (devam) {
                // 1. oyuncudan kelime girmesini isteyin
                System.out.print("1. Oyuncu, kelime girin: ");
                kelime = scanner.nextLine();

                // 2. oyuncuya kelimeyi kabul edip etmediğini sorun
                System.out.print("2. Oyuncu, kelimeyi kabul ediyor musunuz? (Evet/Hayır): ");
                String kabul = scanner.nextLine();

                if (kabul.equalsIgnoreCase("Evet")) {
                    oyuncu1Puan += kelime.length();
                    System.out.println("1. Oyuncunun Puanı: " + oyuncu1Puan);
                } else {
                    System.out.println("Geçersiz kelime! 1. Oyuncu kazandı.");
                    devam = false;
                    break;
                }

                // Yeni oyuncuya devam etmek isteyip istemediğini sorun
                System.out.print("Oyuna devam etmek ister misiniz? (Evet/Hayır): ");
                String devamEt = scanner.nextLine();

                if (devamEt.equalsIgnoreCase("Evet")) {
                    System.out.print("Eklemek istediğiniz kelimeyi girin: ");
                    String ekKelime = scanner.nextLine();
                    System.out.print("Başa mı sona mı eklemek istersiniz? (Başa/Sona): ");
                    String konum = scanner.nextLine();

                    if (konum.equalsIgnoreCase("Başa")) {
                        kelime = ekKelime + kelime;
                    } else {
                        kelime = kelime + ekKelime;
                    }
                } else {
                    System.out.println("Oyun bitti!");
                    devam = false;
                    break;
                }
            }

            if (oyuncu1Puan > oyuncu2Puan) {
                System.out.println("1. Oyuncu kazandı! Puan: " + oyuncu1Puan);
            } else if (oyuncu2Puan > oyuncu1Puan) {
                System.out.println("2. Oyuncu kazandı! Puan: " + oyuncu2Puan);
            } else {
                System.out.println("Oyun berabere! Puanlar eşit: " + oyuncu1Puan);
            }
        }
    }

