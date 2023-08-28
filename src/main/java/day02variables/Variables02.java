package day02variables;

public class Variables02 {
    //Non-Primitive Data Type


    public static void main(String[] args) {
        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
String ogrenciAdi ="Ali Can";
int age=7;
//stringler için default deger (varsiyilan deger) null dir
        //null demek 0 demk degildir
        //null hiclik demektir
        //icinde variable veya method bilinmeyen bos bir obje demektir
        /*
        interview sorusu
        primitive ve non -primitive arasındaki fark nedir?
        1)primitive ler sadece bizim atadigimiz degeri icerir
           non-primitiveler bizim atadigimiz degeri ve methodlar icerir.

        2) primitiveler kucuk harfle baslar
           non-primitiveler ise buyuk harfle baslar

        3) primitiveleri java uretmistir ve 8 tanedir
           non-primitive leri java ve programcilar uretebilir, sinirsiz sayidadir

        4) primitive ler memory de data typelarina gore sabit boyutta bellek kullanir
           non-primitive ler memory de buyuklugune gore degisen boyutlarda bellek kullanabilir.


         */

byte not1 = 60;
byte not2 = 70;
        System.out.println(not1+not2);




    }
}
