package strinnthings;

import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        //scanner 02
  /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adınızı ve soyadınızı giriniz");
        String isimSoyisim= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        int kilo= scan.nextInt();
        System.out.println("lütfen salona kaç ay deva edeceğinizi giriniz");
        int ay= scan.nextInt();
        System.out.println("$"+(ay*20));
    }
}
