package hw2;

/**
 *
 * @author dylan
 */
public class MovingAverage{
	int maxTotal;
	int total;
	double lastNum[];
	double avg;
	int head;
	
	public MovingAverage(int N){
		maxTotal = N;
		lastNum = new double[N];
		avg = 0;
		head = 0;
		total = 0;
	}
	
	public void next(double num){
		double prevSum = total*avg;
		
		if(total == maxTotal){
			prevSum-=lastNum[head];
			total--;
		}
		
		head = (head+1)%maxTotal;
		int emptyPos = (maxTotal+head-1)%maxTotal;
		lastNum[emptyPos] = num;
		
		double newSum = prevSum+num;
		total++;
		avg = newSum/total;
                
                System.out.println("The moving average is " + avg + ".");
	}
	

        
        public static void main(String[] args){
            MovingAverage m = new MovingAverage(3);
            m.next(1); //return 1
            m.next(10); // return 5.5
            m.next(3); //return 4.6
            m.next(5); //return 6
        }
}
