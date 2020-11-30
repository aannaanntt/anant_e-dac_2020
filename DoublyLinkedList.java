public class DoublyLinkedList 
{
	private ListNode head;//will hold the first node of doubly linked list
	private ListNode tail;//will hold the last node of doubly linked list
	private int length;

	private  class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
		
		}
	}
	public DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty()
	{
		if(length==0)
		{
			return true;
		}
		return false;
	}
	public int length()
	{
		return length;
	}
	public void displayForward()
	{
		if(head == null)
		{
			return;
		}
		ListNode temp=head;
		while(temp!= null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp+"->");
	}
	public void displayBackwards()
	{
		if (tail == null)
		{
			return;
		}
		else
		{
	    ListNode temp = tail;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.previous;
		}
		System.out.print(temp+"->");
		}
	}
	public void insertAtFirst(int data)
	{
		ListNode  newnode =new ListNode (data);
		
		if(isEmpty())
		{
			tail = newnode;
		}else
		{
			head.previous=newnode;
		}
		newnode.next=head;
		head = newnode;
		length++;
			
	}
	public void insertAtPos(int data,int pos)
	{
	
		if(pos == 1)
		{
			insertAtFirst(data);
		}
		if(pos>length)
		{
			 insertAtLast(data);
		}
		else
		{
		
			int count =1;
			ListNode temp = head;
			while(temp.next != null)
			{
				
				count++;
				if(count==pos)
				{
					break;
				}
				temp=temp.next;
			}
			ListNode newnode = new ListNode(data);
			
			newnode.previous = temp;
			newnode.next = temp.next;
			temp.next.previous = newnode;
			temp.next = newnode;
			
			length++;
			
			
		}
	}
	public void insertAtLast(int data)
	{
		ListNode newnode=new ListNode(data);
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.previous=tail;
		}
		tail=newnode;
		length++;
		
	}
	public ListNode deleteAtFirst()
	{
		if(isEmpty())
		{
			System.out.println("invalid position");
		}
		
			ListNode temp =head;
			if(head == null)
			{
				tail = null;
			}
			else
			{
				head.next.previous=null;
			}
			head = head.next;
			temp.next=null;
			length--;
			return temp;
		
		
	}
	public ListNode dalateAtLast()
	{
		if(isEmpty())
		{
			System.out.println("invalid position");
		}
		ListNode temp = tail;
		if(head == null)
		{
			tail = null;
		}
		else
		{
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous=null;
		length--;
		return temp;
	}
	public void deletePos(int pos )
	{
	if(pos < 0)
	{
		System.out.println("Pos does not");
	    return;
	}
	if(pos==1)
	{
		deleteAtFirst();
	}
	else if(pos>length)
	{
		dalateAtLast();
	}
	else
	{
		int count=1;
	ListNode temp = head;
		
		while(temp.next!=null)
		{
			count++;
			if(count==pos)
			{
				break;
			}
			temp=temp.next;
		}
		temp.next.next.previous=temp;
		temp.next=temp.next.next;
		length--;
	}
}
	public static void main(String[] args)
	{
		DoublyLinkedList dls=new DoublyLinkedList ();
		dls.insertAtFirst(10);
		dls.insertAtPos(34, 2);
		dls.insertAtPos(78, 3);
		dls.insertAtPos(23, 4);
		dls.insertAtPos(88, 5);
		dls.deleteAtFirst();
		dls.dalateAtLast();
	//dls.insetLast(50);
//	dls.insertAtPos(34, 4);
dls.displayBackwards();
      //   dls.deleteAtFirst();
         // dls.dalateAtLast();
		dls.displayForward();
		//dls.displayBackwards();
	}

}
