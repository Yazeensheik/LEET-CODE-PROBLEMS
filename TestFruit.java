package oops_inheritance;

class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit
    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {

    // Constructor
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Apple: " + name + ", Taste: " + taste);
    }
}

class Orange extends Fruit {

    // Constructor
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Orange: " + name + ", Taste: " + taste);
    }
}

public class TestFruit {
    public static void main(String[] args) {
        // Creating instances of Apple and Orange
        Apple apple = new Apple("Red Apple", "Sweet", "Medium");
        Orange orange = new Orange("Navel Orange", "Citrusy", "Medium");

        // Invoking the eat method on each instance
        apple.eat();
        orange.eat();
    }
}