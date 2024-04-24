package Ex_24042024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        //Max number in two
        System.out.println("Enter the num1");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.println("Enter the num2");
        int num2=sc.nextInt();

        int max=Math.max(num1,num2);
        System.out.println("Max by Math.max func()"+max);

        if (num1>num2)
        {
            System.out.println("max is -->"+num1);
        }
        else {
            System.out.println("Max is -->"+num2);
        }
sc.close();

    }
}
