package EX_20042024;

import java.util.Locale;

public class Lab064 {
    public static void main(String[] args) {
        String Password="Anu@123";
        String pass_u=Password.toLowerCase();
        // pass_u == password?
        // pass_u.equals(password) -> No
        // pass_u.equalsIgnoreCase(password) -> Yes

        System.out.println(pass_u == Password);
        System.out.println(pass_u.equals(Password));
        System.out.println(pass_u.equalsIgnoreCase(Password));

        System.out.println(Password.substring(0,3));
        System.out.println(Password.indexOf("A"));
    }
}
