package May1.HW_11052024;

public class student1 {
    String name;
    int age;
    String grade;

    public student1(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

 void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects for three students and assigning values
        student1 student1 = new student1("John", 18, "A");
        student1 student2 = new student1("Emma", 17, "B");
        student1 student3 = new student1("Michael", 16, "A");

        // Displaying details of each student
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("Details of Student 2:");
        student2.displayDetails();

        System.out.println("Details of Student 3:");
        student3.displayDetails();
    }
}
