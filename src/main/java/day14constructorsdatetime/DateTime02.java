package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime = LocalTime.now();
System.out.println(myCurrentTime);//22:44:37.004359800

                /*
        DateTime Class ta kullanilan tarih saat formatlari
            HH : mm ==> 24'lu saat sistemi
            hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
            hh : mm a ==> 12'li saat sistemi AM, PM
            HH : mm : ss==> saniyeyi gosterir
​
            HH : MM ==> yanlis format cunku MM aylar icin kullanilir
            "mm" "minute" demektir. "MM" "month" demektir.
​
            dd-MM-yyyy ==> gun - ay - yil
            MMM ==> Aug
            MMMM ==> August  */


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime);


        //Date formati
        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);


        //28/Aug/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);//2023-08-28T23:16:58.182984300

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm");
        String formattedLdt= dtf4.format(ldt);
        System.out.println(formattedLdt);                    //28 * 08 * 2023 - 11 : 19
//deneme
    }

}