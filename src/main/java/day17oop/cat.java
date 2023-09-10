package day17oop;

public class cat extends Animal {
    public void meow(){
        System.out.println("cats meow");
    }

    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void drink() {
        System.out.println("cat drink");
    }
}
