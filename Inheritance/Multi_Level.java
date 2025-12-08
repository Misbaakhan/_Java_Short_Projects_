
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

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }
}

public class Multi_Level {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.play();
        p.sound();
    }

}
