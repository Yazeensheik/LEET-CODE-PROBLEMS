package oops_inheritance;
public class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Creating an object of the Box class
        Box myBox = new Box(10, 20, 15);

        // Testing the functionalities
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}