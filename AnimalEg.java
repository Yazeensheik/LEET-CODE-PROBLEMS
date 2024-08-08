package oops_inheritance;

class Animal {
    // Method for eating
    public void eat() {
        System.out.println("Animal is eating");
    }

    // Method for sleeping
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {
    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    // Overriding the sleep method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    // Method for flying
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class AnimalEg {
    public static void main(String[] args) {
        // Creating an instance of Animal class
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        // Creating an instance of Bird class
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}