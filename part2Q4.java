class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Barking loudly");
    }
}

public class part2Q4 {
    public static void main(String[] args) {
        Animal a = new Dog();
Dog d = (Dog) a;
d.bark();

        // a.bark(); // Line X
    }
}
