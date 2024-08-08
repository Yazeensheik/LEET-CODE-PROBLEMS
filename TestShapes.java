package oops_inheritance;

class Shape {
    // Method to draw a shape
    public void draw() {
        System.out.println("Drawing Shape");
    }

    // Method to erase a shape
    public void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    // Overriding the draw method
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Overriding the erase method
    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    // Overriding the draw method
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Overriding the erase method
    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    // Overriding the draw method
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Overriding the erase method
    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class TestShapes {
    public static void main(String[] args) {
        // Creating objects of Circle, Triangle, and Square using polymorphism
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Calling the draw and erase methods
        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}