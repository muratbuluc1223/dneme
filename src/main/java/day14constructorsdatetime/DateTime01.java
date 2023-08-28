package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil alabiliriz?


        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-08-28

        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST
        System.out.println(myCurrentDate.getDayOfWeek());//MONDAY
        //ileriki tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusYears(1).plusMonths(1).plusDays(1));
        //geçmiş tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusMonths(1).minusDays(1).minusYears(1));
//spesifik bir tarih giriniz
LocalDate date1 =LocalDate.of(1980,5,5);
LocalDate date2 =LocalDate.of(2000,5,5);

boolean r1=date1.isAfter(date2);
        System.out.println(r1);
        boolean r2=date1.isBefore(date2);
        System.out.println(r2);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bize yılı,ayı ve günü  sırasıyla yazınız");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();
        LocalDate givenDate=LocalDate.of(year,month,day);
        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }

        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Lütfen bize yılı,ayı ve günü  sırasıyla yazınız");
        int y= input.nextInt();
        int m= input.nextInt();
        int d= input.nextInt();
       LocalDate date= LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }

}