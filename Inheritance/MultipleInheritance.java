
interface Animal {

    void eat();
}

interface Pet {

    void play();
}

class Dog implements Animal, Pet {

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with ball");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
