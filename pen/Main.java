package pen;
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Pen class
        Pen p = new Pen();

        // Accessing and printing properties of the Pen object
        System.out.println("Color: " + p.color);
        System.out.println("Type: " + p.type);
        System.out.println("Point: " + p.point);

        // Accessing and printing the static field
        System.out.println("Clicked: " + Pen.clicked);

        // Calling static methods
        Pen.click();
        System.out.println("Clicked: " + Pen.clicked);

        Pen.unclick();
        System.out.println("Clicked: " + Pen.clicked);
    }
}
