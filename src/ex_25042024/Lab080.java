package ex_25042024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {


        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");
        String browsername =sc.nextLine();
        browsername=browsername.toLowerCase();


        switch(browsername){
            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the firefox
                // Webdriver driver = new firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                // Further code to start the edge
                // Webdriver driver = new edge(); // Selenium Code
                break;

            default:
                System.out.println("I have not idea which browser is this");
        }



    }
}
