package EX_27042024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if (num>0) {
            System.out.println("Positive number");
        } else if (num<0) {
            System.out.println("Negative number");
        }
        else{
            System.out.println("zero");
        }
        sc.close();
    }
}
