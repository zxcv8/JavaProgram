package May.ex_14052024;

public class ATBPerson {
    //Variables
//Local variable-present in the methods
//Instance varaiable

    String name;
    long phone;
    String email;

    public ATBPerson(String name, long phone, String email, boolean ismarried, String coursename) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.ismarried = ismarried;
        this.coursename = coursename;
    }

    boolean ismarried;
    String coursename;
    public ATBPerson(String name){
        this.name = name;
    }

    public ATBPerson(String name, long phone){
        this.name = name;
        this.phone = phone;
    }
//Void printdetails(){
//int age=10;
//System.out.println("age");
//System.out.println("Print details of the student");
//}

    //CONSTRUCTOR
//Default Constructor
    ATBPerson()
    {
        System.out.println("Default Constructor");
//dc
        //speccial method with no return type.
        // 1 called, when you create new Object
        // It has same name as the className
        coursename="ATB";
    }
//Param Constructor
       // ATBPerson(String givenName){
       // System.out.println("Param Constructor");
    //}
    //    void ATBPerson() {
    //    System.out.println("default - Constructor");
   // }



}
