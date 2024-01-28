package shirt;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Shirt class
        Shirt s = new Shirt("Indigo", "S");

        // Accessing and printing properties of the Shirt object
        System.out.println("Color: " + s.color);
        System.out.println("Size: " + s.size);
    }
}
