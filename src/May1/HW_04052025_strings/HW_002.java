package May1.HW_04052025_strings;

public class HW_002 {
    public static void main(String[] args) {
        String str="Hello World";

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i);
            if(result.contains(ch)){
                continue;
            }
            result +=ch;
        }
        System.out.println(result);
    }
}
