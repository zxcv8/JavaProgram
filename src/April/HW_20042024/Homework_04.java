package April.HW_20042024;

public class Homework_04 {
    public static void main(String[] args) {
        double x = 10;
        double y = 12.4 ;
        double z = 56.78;

        //double result =Math.cbrt(Math.sqrt(x)+Math.sqrt(y)-Math.abs(z));
        double result =Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);



    }
}
