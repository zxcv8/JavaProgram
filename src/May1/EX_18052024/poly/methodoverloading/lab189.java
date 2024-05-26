package May1.EX_18052024.poly.methodoverloading;

public class lab189 {
//constructor overloading
    lab189(){

    }
    lab189(int a){

    }
    lab189(int a,int b){

    }
    lab189(int a,String b){

    }
    //method overloading-->multiple methods with same name ,but diffrent argument
    void gift(String a)
    {
        System.out.println("A is a string ->"+ a);
    }
   int gift(int x)
    {
        System.out.println("X is a int ->"+ x);
        return x;
    }
    int gift(float x)
    {
        System.out.println("X is a int ->"+ x);
        return 89;
    }
    void gift(double x)
    {
        System.out.println("X is a int ->"+ x);
    }

    public static void main(String[] args) {
        lab189 p=new lab189();
        p.gift(10);
    }
}
