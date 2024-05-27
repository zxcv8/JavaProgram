package May1.ex_21052024.Abstraction.RealEx;

abstract class BaseClass {

    // Web Automation
    // Heri Inheritance - BaseClass -> Child 1,
    // BaseClass -> Child 2

    abstract String openBrowser();
    abstract String closeBrowser();

    void printLog(){
        System.out.println("Logs");
    }



}
