package Ex_24042024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {

        //Taking the input from the user
        //scanner calss

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Number is odd");}
        else{
            System.out.println("number is even");
        }
        sc.close();
    }
}
