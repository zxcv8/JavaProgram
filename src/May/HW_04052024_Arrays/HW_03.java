package May.HW_04052024_Arrays;

public class HW_03 {

    public static void main(String[] args) {
        int[][] org = {
                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}
        };

        int[][] tra = new int [3][3];

//        Assigning the values
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                tra[i][j] = org[j][i];
            }
        }

//         Printing the original array

        System.out.println(" Original Array ");
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                System.out.print(org[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(" ---------------- ");
        System.out.println(" Transpose Array ");
        for ( int i=0; i< org.length; i++){
            for(int j=0; j< org.length; j++){
                System.out.print(tra[i][j] + " ");

            }
            System.out.println();
        }
    }

}

