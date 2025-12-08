
class Animals {

    void sound() {
        System.out.println("animals make different sounds");
    }
}

class Dog extends Animals {

    @Override
    void sound() {
        System.out.println("dog barks");
    }

}

class Tiger extends Animals {

    @Override
    void sound() {
        System.out.println("tiger roars");
    }

}

public class Hierarchical {

    public static void main(String[] args) {
        Animals a = new Animals();
        a.sound();
        Dog d = new Dog();
        d.sound();
        Tiger t = new Tiger();
        t.sound();
        Animals poly = new Tiger(); // Polymorphism //upcasting
        poly.sound();

    }

}
