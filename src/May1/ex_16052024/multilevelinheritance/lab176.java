package May1.ex_16052024.multilevelinheritance;

public class lab176 {
    public static void main(String[] args) {

//        GrandFather grandFather = new GrandFather();
//        grandFather.home();
//
//        Father father = new Father();
//        father.home();
//
//        Child child = new Child();
//        child.home();


        // Dynamic Dispatch
        //
        grandfather grandFather1 = new grandfather();
        grandfather grandFather2 = new father();
        grandfather grandFather3 = new child();

        father f1 = new child();
        f1.home();

//        Child c1 = new GrandFather();
//        Father c2 = new GrandFather();



    }
}
