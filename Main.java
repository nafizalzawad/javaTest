public class Main {
    //part 2 question 4
    public static void main(String[] args) {
        Animal a = new Dog();
Dog d = (Dog) a;
d.bark();

//part 3- calculator
Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 0));
        
    }
}