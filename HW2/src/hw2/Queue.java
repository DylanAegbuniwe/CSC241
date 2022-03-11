
package hw2;

/**
 *
 * @author dylan
 */
public class Queue 
{ 
	int front, rear, size; 
	int capacity; 
	int array[]; 
	
	public Queue(int capacity){ 
            this.capacity = capacity; 
            front = this.size = 0; 
            rear = capacity - 1; 
            array = new int[this.capacity]; 
			
	} 
	
	boolean empty(Queue queue){ 
            return (queue.size == 0);
        } 
	
	void enqueue( int x){  
            this.rear = (this.rear + 1)%this.capacity; 
            this.array[this.rear] = x; 
            this.size = this.size + 1;  
	} 
	
	int dequeue(){ 
		if (empty(this)) 
			return Integer.MIN_VALUE; 
		
		int item = this.array[this.front]; 
		this.front = (this.front + 1)%this.capacity; 
		this.size = this.size - 1; 
		return item; 
	} 
        
        int peek(){
            int item = this.array[this.front];
            return item;
        }
	
} 