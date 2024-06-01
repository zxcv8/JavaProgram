package May.HW_11052024;

public class Student {
    //attr
    String student_name;
    int studentId;
    String address;
    String email;
    double phoneNumber;

    //beh

    void study()
    {
        System.out.println(student_name + " is studying.");
    }

    void attendClass()
    {
        System.out.println(student_name +"is attending class.");
    }

void submitAssignment()
{
    System.out.println(student_name +"is submitting an assignment.");
}


}
