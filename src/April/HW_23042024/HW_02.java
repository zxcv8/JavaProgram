package April.HW_23042024;

import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
//Program to Find the Largest Among Three Numbers:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1= sc.nextInt();

        System.out.println("Enter the num2");
        int num2= sc.nextInt();

        System.out.println("Enter the num3");
        int num3= sc.nextInt();
int max=num1;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("The max number is: " + max);

        sc.close();
    }
}
