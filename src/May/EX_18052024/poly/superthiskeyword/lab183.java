package May.EX_18052024.poly.superthiskeyword;

public class lab183 {
    public static void main(String[] args) {
    person1 pc1=new person1();
//student1 sc1=new student1();
//If child has DC->PC DC will be called by
// super() automatically in java
        //super.variable
        //super.method()
        //super()->dc
        //super("ANU")->pc
}
}
class person1{
    person1(){
        System.out.println("PERSON1-DC");
    }
    person1(String a){
        System.out.println("PERSON1-pC");
    }
}

class student1 extends person1 {
    student1(){
        //super();
        super("Anu");
        System.out.println("Student1-DC");
    }

}