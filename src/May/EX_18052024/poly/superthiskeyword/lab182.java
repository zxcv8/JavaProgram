package May.EX_18052024.poly.superthiskeyword;

public class lab182 {
    public static void main(String[] args) {
       student s1= new student();
       s1.display();
    }
}
class student extends person{
    //is A relation -->inheritance
    void message(){
        System.out.println("I am student message");
    }
    void display(){
       // this.message();
        super.message();
    }
}
class person
{
    void message()
    {
        System.out.println("I am person message");
    }

}
