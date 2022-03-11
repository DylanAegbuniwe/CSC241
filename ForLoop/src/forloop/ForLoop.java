
package forloop;

/**
 *
 * @author dylan
 */
public class ForLoop {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 81297; i <= 100899; i+=198){
            total += i;
        }
        System.out.println(total);
    }
    
}
