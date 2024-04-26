package ex_25042024;

public class Lab086 {
    public static void main(String[] args) {

        int itemcode=003;

        switch(itemcode){
            case 001-> System.out.println("it is a laptop");
            case 002-> System.out.println("it is a mobile");
            case 003,004-> System.out.println("It's a desktop");
            default-> System.out.println("hello!!!");
        }
      char ch='z';

        switch(ch){
            case 'a','e','i','o','u'-> System.out.println("it is a vowel");
            default-> System.out.println("it is a constant");
        }
    }
}
