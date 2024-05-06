package April.ex_25042024;

public class lab085 {
    public static void main(String[] args) {

        int itemcode=010;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is a electronic gadget");
                break;
            case 004,005,006:
                System.out.println("it is a mechanical gadget");
                break;
            default:
                System.out.println("none");
        }
    }
}
