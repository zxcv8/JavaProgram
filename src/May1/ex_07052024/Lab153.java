package May1.ex_07052024;

public class Lab153 {
    public static void main(String[] args) {


        //no return with no parameter
        saysomethingplease();

        //no return with parameter
        sayhellotoyou("Anusree");

        //return with no parameter
        sumoftwobad(2,3);


        //return wih no parameter
        int result=sumoftwogood(2,3);
    }


    static int sumoftwogood(int a, int b) {
        return a+b;
    }

    static void sumoftwobad(int a,int b) {
             System.out.println(a+b);
    }


    static void sayhellotoyou(String anusree) {
         System.out.println("Hello" + anusree);
    }

    static void saysomethingplease() {
        System.out.println("no return with no parameter");
    }
}
