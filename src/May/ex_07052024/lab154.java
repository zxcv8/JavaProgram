package May.ex_07052024;

import java.util.Scanner;



public class lab154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = sc.nextInt();

        System.out.println("enter the num2");
        int num2 = sc.nextInt();


        //calc
        int r_sum = sum(num1, num2);
        int r_sum2 = sum(34,45);
        int r_sub = sub(num1, num2);
        int r_mul = mul(num1, num2);

        System.out.println("Sum is -> " + r_sum);
        System.out.println("Sum is -> " + r_sum2);
        System.out.println("Sub is -> " + r_sub);
        System.out.println("Mul is -> " + r_mul);

    }
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }








    }

