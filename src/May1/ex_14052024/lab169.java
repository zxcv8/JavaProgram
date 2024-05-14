package May1.ex_14052024;

public class lab169 {


    public static void main(String[] args) {
        /*ATBPerson objectref1= new ATBPerson();


        ATBPerson objectref2= new ATBPerson();
        ATBPerson objectref3=null;*/


       // System.out.println(objectref1.coursename);
// DC are created to assign the value of Instance variable of the class.

        // DC -> Problem -> I can't assing my values to the Instance

        ATBPerson amitRef = new ATBPerson();
        // objRef1.name = "Amit";
        System.out.println(amitRef.coursename);
        System.out.println(amitRef.ismarried);
        System.out.println(amitRef.name);



        ATBPerson swapnilRef = new ATBPerson();
        System.out.println(swapnilRef.name);
        System.out.println(swapnilRef.coursename);

    }
}
