package day16staticoop;

import java.time.LocalDate;
import java.util.Scanner;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static olduğundanb ona ulaşmak için objec oluşturulur
        //sadece class ismini kulanmak yeterlidir
        System.out.println(Student.stdName);
      //age non statick olduğu içinona olaşmak için obje oluşturamk zorundayız

       Student ali=new Student();
       System.out.println(ali.age);

Student.staticMethod();
ali.nonStatikMethod();


    }
}
