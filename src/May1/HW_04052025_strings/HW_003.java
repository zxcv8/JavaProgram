package May1.HW_04052025_strings;

import java.util.Arrays;

public class HW_003 {
    public static void main(String[] args) {

        String s1 = "listens";
        String s2 = "silent";

        if (anagramcheck(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram!!");
        }
    }

    static boolean anagramcheck(String s1, String s2) {
        //Checking length
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        /*transform to arrays*/
        char string1toArray[] = s1.toCharArray();
        char string2toArray[] = s2.toCharArray();

        //sorting

        Arrays.sort(string1toArray);
        Arrays.sort(string2toArray);

        for (int i = 0; i < s1.length(); i++) {
            if (string1toArray[i] != string2toArray[i]) {
                return false;
            }
        }
        return true;

    }
}

