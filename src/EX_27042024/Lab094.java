package EX_27042024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1");
        int num1=sc.nextInt();

        System.out.println("Enter the numb2");
        int num2=sc.nextInt();

        System.out.println("Enter the numb3");
        int num3=sc.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println(num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

        // ? ->  condition ? (if true) -> do this : if false -> do that

        // num1 = 90, num2 = 91 , num3 = 100;
        int largest=(num1>num2)?((num1>num3)?num1:num3) :((num2>num3)?num2:num3);

        /*int A = (num1 > num3) ? num1 : num3;
        int B = (num2 > num3) ? num2 : num3;
        int largest = (num1 > num2) ? A : B;*/

        System.out.println(largest + "is the largest number");
        sc.close();

        //



    }
}
