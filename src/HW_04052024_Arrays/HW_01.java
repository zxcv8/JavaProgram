package HW_04052024_Arrays;

import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        //  Write - Java method to find the maximum value in a 2D array
        int[][] arr = {
                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}
        };

//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length; j++){

                if (arr[i][j] > max ){
                    max = arr[i][j] ;
                }
            }
        }

        System.out.println("Maximum value is " + max );



    }
}