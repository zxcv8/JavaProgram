package April.Ex_18042024;

public class Lab042 {
    public static void main(String[] args) {

        int a =300;
        //byte b=a;-->not possible
        byte b=(byte)a;//explicit

        // 300 -> 32 Bits  0000000000000100101100
        // byte - 8 bits
        // // 0 0 1 0 1 1 0 0
        // 44


        System.out.println(b);
    }
}
