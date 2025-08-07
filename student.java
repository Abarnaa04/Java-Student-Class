// Class definition must match the file name: Student.java
public class student {

    // Member Variables
    String name;
    int age;
    String gender;
    int rollNumber;
    char grade;

    // Member Function to display student details
    void displayInfo() {
        system.out.println("----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Grade      : " + grade);
        System.out.println("---------------------------\n");
    }

    // Main Method: Program entry point
    public static void main(String[] args) {
        // Creating first Student object
        student s1 = new student();
        s1.name = "Abarnaa";
        s1.age = 21;
        s1.gender = "Female";
        s1.rollNumber = 101;
        s1.grade = 'A';

        // Display first student's info
        s1.displayInfo();


        // Creating second Student object
        student s2 = new student();
        s2.name = "Karthik";
        s2.age = 22;
        s2.gender = "Male";
        s2.rollNumber = 102;
        s2.grade = 'B';

        // Display second student's info
        s2.displayInfo();
    }
}
