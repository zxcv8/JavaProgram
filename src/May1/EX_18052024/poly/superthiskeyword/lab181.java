package May1.EX_18052024.poly.superthiskeyword;

public class lab181 {
    public static void main(String[] args) {
        //super keyword in java
        //parent-->child
      //super keyword is reference to parent class
        //variable of parent
        //method of the parent
        //constructor of the parent
car c=new car();
int speed=c.maxspeed;
        System.out.println(speed);
c.display();
    }
}
class car extends Vehicle {
    int maxspeed = 180;
    void display(){
        System.out.println("max speed of vehicle can be "+super.maxspeed);
        System.out.println("max speed of car can be "+this.maxspeed);
    }
}
class Vehicle {
    int maxspeed = 100;//instance variable

    void message() {
        System.out.println("This is vehicle Class");
    }
}
