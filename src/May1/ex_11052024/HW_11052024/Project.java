package May1.ex_11052024.HW_11052024;

public class Project {
    public static void main(String[] args) {

        Course c1=new Course();
        c1.Coursename="Automation Project";
        c1. coursefee=10000;
        c1.coursecode=01;
       c1. instructor="Pramod Dutta";

       c1.course_enrollment();
        System.out.println("Course Name is " + c1.Coursename);
        System.out.println("coursecode is " + c1.coursecode +  "For automation class ");
        System.out.println("Course instructor is " + c1.instructor);
        System.out.println("Course Amount is " + c1.coursefee);



       Student s1=new Student();
       s1.student_name="Anusree";
        s1.studentId=001;
        s1. address="AXB";
        s1. email="a01@gmail.com";
        s1.phoneNumber=800009890;

        System.out.println("Student Name is " + s1.student_name);
        System.out.println("Student Phone is " + s1.phoneNumber);
        System.out.println("Student Email is  " + s1.email);
        System.out.println("Student Id is " + s1.studentId);


        s1.attendClass();
        s1.study();
        s1.submitAssignment();

        Payment p1=new Payment();

        p1.amount=10000;
        p1.method="gpay";

        System.out.println("Payment Amount is " + p1.amount);
        System.out.println("Payment Mode is " + p1.method);


p1.processPayment();


    }
}
