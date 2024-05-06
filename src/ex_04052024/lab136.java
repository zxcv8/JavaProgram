package ex_04052024;

public class lab136 {
    public static void main(String[] args) {

        int [] arrays={30,40,50};
        //double the array
        int[] arrays2=new int[3];

        for (int i = 0; i < arrays.length; i++) {
            arrays2[i]=arrays[i]*2;
        }
        System.out.println("printing the arrays !!");
        for (int i = 0; i <arrays2.length ; i++) {
            System.out.println(arrays2[i]);

        }

    }

}
