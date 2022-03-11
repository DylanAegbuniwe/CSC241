/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author dylan
 */


public class MovingAverage {
     
   public static int binarySearch(int num, int result){
     
       return -1;  
   }
    
    public static void main(String []args){
        ArrayList<Double> Dataset = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        Dataset.add(101.1);
        Dataset.add(120.2);
        Dataset.add(130.3);
        Dataset.add(120.5);
        Dataset.add(150.9);
        int N = Dataset.size();
        int M = 3;
        //Time Complexity is M*(N-M+1) or MN - M^2 + M
        for (int i = M-1; i < N; i++)// N -(M-1) = N-M+1
        {
            double partialSum = 0;
            for (int j = 0; j < M; j++) //M
                partialSum += Dataset.get(i-j);
            result.add(partialSum / M);
        }
            
        
        System.out.println(result);
        //M-1
        //N-(M-1) = N-M+1
    }
}
