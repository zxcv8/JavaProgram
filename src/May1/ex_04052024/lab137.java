package May1.ex_04052024;

public class lab137 {
    public static void main(String[] args) {

        //int [] array1d={450,50,321};


        //2d arrays
        //matrix-rows & columns

        //rows-horizontal
        //columns-vertical
        int [][] array2d={
                {34,12,11},
                {34,12,34},
                {11,23,98}
        };

        int[][]array2d_2=new int[3][3];
        //|0,0,0|
        //|0,0,0|
        //|0,0,0|
        array2d_2[0][0]=34;
        //|34,0,0|
        //|0,0,0|
        //|0,0,0|
        array2d_2[0][0]=12;
        //|34,12,0|
        //|0,0,0|
        //|0,0,0|


        for (int i = 0; i < array2d.length ; i++) {
            for(int j=0;j< array2d[i].length;j++){
                System.out.println(array2d[i][j]);
            }

        }
    }
}
