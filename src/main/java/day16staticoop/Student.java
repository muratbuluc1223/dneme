package day16staticoop;

public class Student {
    /*
    1)static veriable veya statik methodlar(calass memeber) tum objectler için ortak elamandır.
    2)static class memeberlar uzerinde yapılan değişiklikler tüm objeleri etkiler
    3)statik cclass memberlar class'a nostatic class memeberlar oobjeklere monte edilir
    mesala bir clasta 100 tane obje oluşturduğunuzda non-statik olanlar 100 kere oluşturulur
    ama statik olanlar obje sayısından bağımsız olarak bir kere oluşturulur.
    4)static class memberlara ulaşmak için obje oluşturmaya gerek duyyulmaz ama non- static class memberlara
    ulaşmak için obje oluşturmak şarttır.
    5) static variablelerin diğer adı class veriabledir,non static veraibların diğer adı
    instance variable yada object variabledir

    * */
     public  static String stdName="Ali CAN";
      public  int age=18;
      public static void staticMethod(){

          System.out.println("Ben statik metodum");

      }
      public  void nonStatikMethod(){
          System.out.println("ben statik metot değilim");
      }
}
