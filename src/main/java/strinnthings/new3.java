package strinnthings;

import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        //scanner 03
    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333*/

        Scanner sacn=new Scanner(System.in);
        System.out.print("a sayısını giriniz  :");
        int a= sacn.nextInt();
        System.out.print("b sayısını giriniz  :");
        int b= sacn.nextInt();
        System.out.print("c sayısını giriniz  :");
        double c= sacn.nextDouble();
        System.out.println("sonuç  :"+((Math.pow(a,2))-(Math.pow(b,2)))/(3*c));
    }
}
