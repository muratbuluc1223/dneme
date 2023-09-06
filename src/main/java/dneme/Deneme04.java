package dneme;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Deneme04 {
    public static void main(String[] args) {
        LocalTime myCurentTİme=LocalTime.now();

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("HH:mm");
       String fomatedtime=dtf1.format(myCurentTİme);
        System.out.println("fomatedtime = " + fomatedtime);


        //Date formatı
        LocalDate myyCurentDate= LocalDate.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formatterMyUrrentdaty=dtf2.format(myyCurentDate);
        System.out.println("formatterMyUrrentdaty = " + formatterMyUrrentdaty);


    }

}

