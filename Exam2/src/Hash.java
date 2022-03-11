/**
 *
 * @author dylan
 */
import java.util.*;

public class Hash {
    public static void main (String []args){
        int array[] = new int [19];
        Map<Integer, Integer> m = new HashMap<>();
        m.put(16, 35);
        m.put(17, 16);
        m.put(4, 23);
        m.put(18, 54);
        m.put(0, 55);
        m.put(1, -1);
        m.put(2, -1);
        m.put(3, -1);
        m.put(5, -1);
        m.put(6, -1);
        m.put(7, -1);
        m.put(8, -1);
        m.put(9, -1);
        m.put(10, -1);
        m.put(11, -1);
        m.put(12, -1);
        m.put(13, -1);
        m.put(14, -1);
        m.put(15, -1);
        
        for (int i = 0; i < array.length; i++){
            array[i] = m.get(i);
            System.out.print(array[i] + ", ");
        }
    }
      
}