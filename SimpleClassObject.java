class Student {

    String name;
    int rollNumber;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class SimpleClassObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Pranathi";
        s1.rollNumber = 101;

        s1.displayDetails();
    }
}
