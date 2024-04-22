package Ex_18042024;

public class Lab044 {
    public static void main(String[] args) {

        //INCREMENT OPERATOR (++) /DECREMENT (--)
        //PRE,POST
        int a=10;
        int b=++a;//a=a+1-->(Value increased first ->assign the value)
        System.out.println(b);
        System.out.println(a);

        System.out.println("---------------");


        int d=a++;
        System.out.println(d);
        System.out.println(a);

        System.out.println("---------------");
        int e=a++;
        System.out.println(e);
        System.out.println(a);
    }
}
