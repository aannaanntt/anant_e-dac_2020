public class Stack {
	 int top;
	 int capacity;
	 int stack[];
    
	
	Stack()
	{
	
	   top=-1;
	   capacity =10;
	   stack = new int[capacity];
		
	}
 void	push(int data)
	{
	 if(isFull())
	 {
		 System.out.println("stack is full");
	 }
	 else {
			stack[++top]=data;
		
	 }
	}
public int  pop()
 {
	if(isEmpty())
	{
		System.out.println("Stack is empty");
	}
	 return stack[top--];
 }
boolean  isFull()
 {
	 if(top==capacity-1)
	 {
		 return true;
	 }
	 return false;
 }
public int peek()
{
	return stack[ top];
}
boolean isEmpty()
{
	if(top==-1)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) 
	{
	 // Scanner sc=new Scanner(System.in);
	 // int size=sc.nextInt();
	  
       Stack st=new Stack();
       st.push(6);
       st.push(5);
       st.push(3);
       st.push(2);
       st.push(1);
      
     System.out.println(  st.peek());
       
       
    //  System.out.println( st.isEmpty());
	}

}