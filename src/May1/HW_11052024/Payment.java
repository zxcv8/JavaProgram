package May1.HW_11052024;

public class Payment {
    //attr
    double amount;
     String method;

//beh

    void processPayment() {
        System.out.println("Processing payment of rs/-" + amount + " via " + method);
        System.out.println("Payment processed successfully!");
    }

}
