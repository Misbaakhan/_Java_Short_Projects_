
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

public class SingleInheritance {

    public static void main(String[] args) {
        Animals a=new Animals();
        a.sound();
        Dog d=new Dog();
        d.sound();
        Animals poly = new Dog(); // Polymorphism //upcasting
        poly.sound();

    }

}
