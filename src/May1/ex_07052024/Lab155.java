package May1.ex_07052024;

public class Lab155 {


    static void givemoneybeg() {
        System.out.println();
    }

    static int givemoneyfriend(int i) {
        i = i + 8;
        return i;
    }

    public static void main(String[] args) {

        System.out.println("Start of the program");
        int money = givemoneyfriend(100);
        System.out.println(money);

        givemoneybeg();
        System.out.println("End of the program");

    }
}




