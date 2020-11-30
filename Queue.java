public class Queue {
int n=6;
   int arr[]=new int[n];
   int rear=-1;
   int front=0;
   void enQueue(int x)
   {
       if(isfull())
       {
           System.out.println("queue is Full");
       }
       arr[++rear]=x;
   }
    int deQueue() {
			    int element;

			    // if queue is empty
			    if (isempty()) {
			      System.out.println("Queue is empty");
			      return (-1);
			    }
			    else {
			      // remove element from the front of queue
			      element = arr[front];

			      // if the queue has only one element
			      if (front >= rear) {
			        front = -1;
			        rear = -1;
			      }
			      else {
			        // mark next element as the front
			        front++;
			      }
			      System.out.println( element + " Deleted");
			      return (element);
			    }
			  
   }
   boolean isfull()
   {
        return rear==n-1;
   }
   boolean isempty()
   {
       return rear==front;
   }
   void display()
   {
       for(int i=front;i<=rear;i++)
           System.out.println(arr[i]);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Queue tr =new Queue();
        
        tr.enQueue(10);
                tr.enQueue(20);
                        tr.enQueue(30);
   
                   tr.deQueue(); 

        tr.display();
    }
    
}