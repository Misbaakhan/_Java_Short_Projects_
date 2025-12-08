class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog implements Pet {
    @Override
    public void play() {
        System.out.println("Puppy plays");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound(); 
        p.play();
    }
}
