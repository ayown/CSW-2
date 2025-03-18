package JAVA_ERRORHANDLING;

import java.util.*;
class StringException extends Exception{

}

public class Test6 {
    public static String checkVowels(String st) throws Exception {
        char[] str = st.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                return "vowel present";
            }
        }
        throw new StringException();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        try {
            System.out.println(checkVowels(s));
        } catch (Exception e) {
            System.out.println("does not contain vowels");
        }
    }
}
