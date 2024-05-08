package May1.ex_07052024;

public class lab151 {
    public static void main(String[] args) {

        int r1=sumoftwo(2,3);
        System.out.println(r1);
        int r2=sumoftwo(2,2);
        System.out.println(r2);
        String r3=sumoftwo("anu",4);
        System.out.println(r3);


    }

    static int sumoftwo(int a,int b){
        return a+b;
    }

    static String sumoftwo(String a,int b){
        return a+b;
    }
}
