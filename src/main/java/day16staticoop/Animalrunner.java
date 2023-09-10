package day16staticoop;

public class Animalrunner {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.meow();
        c1.eat();
        c1.drink();
        Dog c2= new Dog();
        c2.bark();
        c2.drink();
        c2.eat();

        Bird c3 = new Bird();
        c3.tweet();
        c3.drink();
        c3.eat();
    }
}
