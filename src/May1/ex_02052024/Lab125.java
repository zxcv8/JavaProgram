package May1.ex_02052024;

public class Lab125 {

    public static void main(String[] args) {
        int [] ages={22,24,32,31,27};
        //fixed elements

        int [] ages2=new int[5];
        //case 2-here by default value of all elements will be ?
        System.out.println(ages2[0]);
        System.out.println(ages2[4]);

        ages2[0]=40;
        System.out.println(ages2[0]);


        String [] breakfast={"idli","milk","coffee","tea","fruits","poha"};
        System.out.println(breakfast.length);
    }

}
