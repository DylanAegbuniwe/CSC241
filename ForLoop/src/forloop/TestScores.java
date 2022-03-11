
package forloop;

import java.util.*;
        
/**
 *
 * @author dylan
 */
public class TestScores {
    ArrayList<Double> testScores;

    public TestScores(ArrayList<Double> scores) {
        testScores = scores;
        for (Double tS : scores){
            if ((tS < 0) || (tS > 100)){
              throw new IllegalArgumentException("The test scores are not valid.");  
            }
        }
    }
    
    public double getAverage(){
        double average = 0.0;
        
        for (Double testScore : testScores) {
            average += testScore;
        }
        return average / testScores.size();
    }
    
    public double getHighestScore(){
        double high = 0.0;
        
        for (Double testScore : testScores) {
            if (testScore > high) {
               high = testScore; 
            }
            
        }
        return high;
    }
    
    public double getLowestScore(){
        double low = 0.0;
        
        for (Double testScore : testScores) {
            if (testScore < low && testScore != 0.0) {
               low = testScore; 
            }
            
        }
        return low;
    }
}
