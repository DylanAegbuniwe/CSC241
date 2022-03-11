
/**
 *
 * @author dylan
 */
public class FindPattern {
    static boolean containPattern(String s){
        String seq1 = "";
        String seq2 = "";
        for (int i = 0; i < s.length()/2; i++){
            seq1 += s.charAt(i);
        }
        for (int i = s.length()-1; i > s.length()/2; i--){
            seq2 += s.charAt(i);
        }

      if (seq1.equals(seq2)){
          System.out.println("true");
          return true;
      }
      else 
          System.out.println("false");
          return false;
        
    }
    
    public static void main(String []args){

        containPattern("a+b&b+a");
    }
    
}
