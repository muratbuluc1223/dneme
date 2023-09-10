package day17oop;

public class Vehicle {

 /*
    1) Child class tan bir objec olusturdugunuzda Constructorlar en ustteki parent classtan baslatilarak alta doğru calistirilir

    child callstaki constructorlardan parent classtaki constructor a gidebilmek içinsuper() kullanılır
    paret classta birden fazla consacter varrsa istenilen consaktırlar super() ifadesi parentesi içerisine yazılan paremetreler yardımı ile seçilebilir
    aynı class içindeki connstructorları seçmek için this() kullanılır,aynı clasta birden fazla conssuctor varsa ozamanda
    istenilen this() ifadesindeki parentez içersine yazılan paremetreler yardımı ile seçilebilir
    super() ifadesini yazmasanızda java sanki super varmmış gibi davranır ama kodunuzu daha okunur kılmak için yazmanız tavsiye edilir

super() ve this() ifadeleri consuter içinde her zaöman ilk satırda olmalıdır
bir consucter in içine yanlızca ya super() ve this () sadece bir kere kullanılabilir
ınheritance veriable  ve metodları çağirmak içn this veya super kullanılır
this aynı clastaki vaiableleri ve meetodları kullanmak için kullanılır
super parent classtaki veriableleri ve metodları çağırmak iiçin kullanılır

     */

    public Vehicle() {

this(2000);

        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {

    }

    {
        System.out.println("vehicle 2");

    }
}