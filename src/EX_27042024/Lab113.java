package EX_27042024;

public class Lab113 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2 ==0 ){
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> " + i);
        }

    }
}
