package April.HW_23042024;

public class HW_05 {
    public static void main(String[] args) {
        //Program to Check if a Number is Prime or Not

        for(int i=1;i<=100;i++)
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 ==0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
    }
    }

