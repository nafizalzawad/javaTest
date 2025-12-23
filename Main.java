public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
Dog d = (Dog) a;
d.bark();

        // a.bark(); // Line X
    }
}