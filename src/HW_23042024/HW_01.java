package HW_23042024;

import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        //Program to Check if a Number is Positive, Negative, or Zero.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num>0) {
            System.out.println("positive number");
        }
            else if(num<0){
                System.out.println("negative number");
            }
            else
        {
            System.out.println("zero");
        }
            sc.close();

    }
}
