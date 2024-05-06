package April.ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);

        switch (user_input) {
            case 'a':
                System.out.println("it is a vowel");
                break;
            case 'e':
                System.out.println("it is a vowel");
                break;
            case 'i':
                System.out.println("it is a vowel");
                break;
            case 'o':
                System.out.println("it is a vowel");
                break;
            case 'u':
                System.out.println("it is a vowel");
                break;

            default:
                System.out.println("it is a constant ");
        }
        sc.close();

    }
        }



