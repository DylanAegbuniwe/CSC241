/**
 *
 * @author dylan
 */
import java.util.*;
import java.lang.*;
public class SecretNumber {
    static String decrypt(String s){
        String output = "";
        for (int i = 0; i < s.length(); i++)
            if (i % 2 == 0) {
                output += (s.charAt(i));   
            }
        
        for (int i = 0; i < s.length(); i++)
            if (i % 2 != 0) {
                output += (s.charAt(i));
            }
        
        return output;
    }
    public static void main(String []args){
        System.out.println(decrypt("631758924"));
    }
}
