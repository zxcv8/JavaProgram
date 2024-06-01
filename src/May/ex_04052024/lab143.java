package May.ex_04052024;

public class lab143 {
    public static void main(String[] args) {

        String s1="Anusree" ;
        String s2=new String("Anusree");

        StringBuffer StringBuffer=new StringBuffer("Anusree");
        StringBuffer.append("Pavithran");
        StringBuffer.reverse();
        System.out.println(StringBuffer);

        StringBuilder StringBuilder=new StringBuilder("Anusree");
        StringBuffer.append("Pavithran");


        String password = "pass@123";
        password = "123";

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);
    }
}
