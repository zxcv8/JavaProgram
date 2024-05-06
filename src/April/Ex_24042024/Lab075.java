package April.Ex_24042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(num>20)
        {
            System.out.println("Num>20");

        }
        else if(num>10){
            System.out.println("number is between 10 and 20");

        }
        else {
            System.out.println("number is less than 20");
        }


    }
}
