public class Student {

    private String name;
    private int rollNo;
    private int age;
    private String department;
    private double mark1;
    private double mark2;
    private double mark3;

    // Constructor
    public Student(String name, int rollNo, int age,
                   String department,
                   double mark1, double mark2, double mark3) {

        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.department = department;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Calculate Total
    public double getTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculate Average
    public double getAverage() {
        return getTotal() / 3;
    }

    // Calculate Grade
    public String getGrade() {

        double avg = getAverage();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else
            return "F";
    }

    // Pass or Fail
    public String getResult() {

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40)
            return "PASS";
        else
            return "FAIL";
    }

    // Display Student Details
    public void displayStudent() {

        System.out.println("\n====================================");
        System.out.println("STUDENT REPORT CARD");
        System.out.println("====================================");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Mark 1     : " + mark1);
        System.out.println("Mark 2     : " + mark2);
        System.out.println("Mark 3     : " + mark3);
        System.out.println("------------------------------------");
        System.out.println("Total      : " + getTotal());
        System.out.println("Average    : " + getAverage());
        System.out.println("Grade      : " + getGrade());
        System.out.println("Result     : " + getResult());
        System.out.println("====================================");
    }

    public static void main(String[] args) {

        Student s1 = new Student(
                "Abarnaa",
                101,
                21,
                "Artificial Intelligence & Data Science",
                95,
                88,
                92);

        Student s2 = new Student(
                "Karthik",
                102,
                22,
                "Computer Science",
                75,
                82,
                78);

        s1.displayStudent();
        s2.displayStudent();
    }
}
