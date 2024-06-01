package May.ex_02052024;

public class Lab128 {
    public static void main(String[] args) {

        //== ->ref
        //.equals()-->values/content

    int [] arr1={1,2,3,4,5};
    int [] arr2={1,2,3,4,5};
        /*System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1==arr2);*/

        int [] arr3=arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2));//object  .java-ref


        String s1="Anu";
        String s2="Anu";
        System.out.println(s1.equals(s2));//contents -string .java
        }
}
