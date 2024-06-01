package May.ex_07052024;

public class lab157 {
    public static void main(String[] args) {
f1();
String [] names={"anusree","pavithran"};
        String [] names2=new String[2];
        names2[0]="Anu";
        names2[1]="sree";
f1(names);

        // Parameter -  any data type
        // Primitive - byte, short, long, float, int, boolean
        // Non-Primitive - String, Arrays
    }
    static void f1(String[] a) {
        //     for(String names:a)
        //       System.out.println(names);
        //   }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void f1(){
        f2();
        System.out.println("f1");
    }
    static void f2(){

        System.out.println("f2");
    }
}
