package strinnthings;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
    para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
        double bakiye = 1000.0;  // Başlangıç bakiyesi 1000 TL
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Bakiye Öğrenme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");

            ;System.out.print("lütfen yapmak istediğiniz işlemim işlem numarasını yazın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Yatırılacak miktarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    if (yatirilanMiktar > 0) {
                        bakiye += yatirilanMiktar;
                        System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
                    } else {
                        System.out.println("Geçersiz miktar. Pozitif bir miktar girin.");
                    }
                    break;
                case 3:
                    System.out.print("Çekilecek miktarı girin: ");
                    double cekilenMiktar = scanner.nextDouble();
                    if (cekilenMiktar > 0 && cekilenMiktar <= bakiye) {
                        bakiye -= cekilenMiktar;
                        System.out.println("çekilen möiktar  : "+ cekilenMiktar + " Yeni bakiye: " + bakiye + " TL");
                    } else if (cekilenMiktar > bakiye) {
                        System.out.println("Yetersiz bakiye. Daha düşük bir miktar girin.");
                    } else {
                        System.out.println("Geçersiz miktar. Pozitif bir miktar girin.");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler!");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
            }
        }
    }
}
