package April.HW_23042024;

import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {
        //Program to Check if a Character is a Vowel or a Consonant.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is a Consonant");
        }
sc.close();

    }
}
