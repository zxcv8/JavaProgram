package May.EX_18052024.poly.superthiskeyword;

public class Lab185 {

    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d2=new Dog("Lab");
        d2.display();
        Dog d3=new Dog("golden retriever","Dog TT");
        d3.display();
        //constructor chaining-->child DC-->Parent's DC
    }
}
class animal{
    int a;
    String type;
    public animal() {
        System.out.println("Animal DC");
    }
    animal(String type){
        this.type=type;
        System.out.println("Animal Pc");
    }
}

class Dog extends animal{

    String breed;
Dog(){
    super();
    System.out.println("Dog Dc");
}

     Dog(String breed) {
    //super("DOG TYPE");
        this.breed = breed;
    }

    Dog(String breed,String type) {
       // super(type);
       // this("Breed set by dog only");
        this.breed = type;
        System.out.println("PC with two arg");
    }

    Dog(String breed,String type,int a) {
        // super(type);
        this("Breed set by dog only","Golden retriever");
        //this.breed = breed;
        this.a = a;
        System.out.println("PC with two arg");
    }
    void display()
    {
        System.out.println("Type:"+type+" , Breed :" + breed);
    }
}
