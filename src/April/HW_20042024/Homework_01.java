package April.HW_20042024;

public class Homework_01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        int result= (a > b) ? (a > c ? a : c) : (b > c ? b : c);


        System.out.println(result);
    }
}
