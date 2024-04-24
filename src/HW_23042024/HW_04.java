package HW_23042024;

import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if((num%4==0 && num %100 !=0) || (num%400 ==0)){
            System.out.println("It is a Leap year");
        }else{
            System.out.println("It is not a leap year");
        }
        sc.close();

    }
}
