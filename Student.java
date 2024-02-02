public class Student {
    String name;
    int roll;

    public void write() {
        System.out.println("Student is writing");
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Mukesh";
        s1.roll=19;
        
        System.out.println(s1.name + " is a " + s1.roll);
    }
}
