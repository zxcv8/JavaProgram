package May1.ex_16052024.Singleinheritance;

public class Lab174{
    public static void main(String[] args) {
        // ## What is Inheritance?
        // Inherit Attributes and Behaviour from the parent, Grand parent.

        // Superclass |  Parent Class | Base Class
        // Subclass |  Child Class | Derived Class

        // Parent -> Child

        // Child extends Parent {}
        // extend keyword -> parent's Attributes are available to the child(class)

        // Single Inheritance
        // Parent -> Pro
        // Child -> Java
        // Single Inheritance
        // Parent -> Pro
        // Child -> Java

        // Java extends Programming
        Programming p = new Programming(12,"KO posan");
        Java j = new Java("lambda exp");

        p.printinfo();
        j.printInfo();


        Programming p1 = new Programming(12,"Van Russom");
        p1.printinfo();

        Python python = new Python();
        python.bhk3();
        python.printinfo();



    }

}



