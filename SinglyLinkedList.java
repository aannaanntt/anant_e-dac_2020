class SinglyLinkedList
{
	public  ListNode head;
	private static class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public ListNode insertbeg(ListNode head ,int data)
	{
		ListNode newnode=new ListNode(data);
		if(head == null)
			
		{
			return newnode;
		}
		newnode.next=head;
		head=newnode;
		return head;//this is the new head of the list
	}
	
	
	public ListNode insertAtPos(ListNode head,int pos,int data)
	{
		int size=length(head);
		if(pos<1 || pos>size+1)
		{
			System.out.println("invalid position");
			return head;
		}
		ListNode newnode=new ListNode(data);
		if(pos == 1)
		{
		newnode.next=head;
		return newnode;
		}
		else
		{
			ListNode previous= head;
			int count =1;
			while(count < pos-1)
			{
				previous = previous.next;
				count ++;
			}
			ListNode current = previous.next;
			newnode.next= current;
			previous.next = newnode;
			return head;
			
				
		}
	}
public ListNode removeDuplicates(ListNode head) 
    {
    ListNode to_free;
        if(head == null)
        {
            return null;
        }
        if(head.next!=null)
        {
            if(head.data == head.next.data)
            {
            to_free=head.next;
            head.next=head.next.next;
            removeDuplicates(head);
        }
        else
        {
            removeDuplicates(head.next);
        }
        }
        return head;


    }
	public void insertAfter(ListNode previous, int data)
	{
		if(previous == null)
		{
			System.out.println("Previous cannot be null");
			return;
		}
		ListNode newnode= new ListNode(data);
		newnode.next=previous.next;
		previous.next=newnode;
		
	}
public ListNode	insertend(ListNode head, int data)
{
	ListNode newnode=new ListNode(data);
	if(head==null)
	{
		return newnode;
	}
	ListNode current=head;
	while(null!=current.next)
	{
		current=current.next;
	}
	current.next=newnode;
	return head;
}
	public int length(ListNode head)
	{
		if(head == null)
		{
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	public ListNode DeleteAtFirst( ListNode head)
	{
		if(head == null)
		{
			return head;
		}
		ListNode temp = head;
		head = head.next;
		temp.next=null;
		return temp;
		
	}
	public void display(ListNode head)
	{
		
		if(head == null)
		{
			return;
		}
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.data+"   ");
			current=current.next;
		}
		System.out.println(current);
	}
	public ListNode DeleteEnd(ListNode head)
	{
		if(head == null)
		{
			return head;
		}
		ListNode last = head;
		ListNode previoustolast = null;
		while(last.next!=null)
		{
			previoustolast=last;
			last=last.next;
		}
		previoustolast.next=null;
		return last;
				
	}
	public ListNode DeleteAtPos(ListNode head,int pos)
	{
		int size=length(head);
		if(pos<1 || pos>size+1)
		{
			System.out.println("Invalid position");
		}
		if(pos == 1)
		{
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
		else
		{
			ListNode previous = head;
			int count =1 ;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
				
			}
			ListNode current =previous.next;
			previous.next=current.next;
			current.next = null;
			return current;
		}
	}
	
	public static void main(String[] arg)
	{
		SinglyLinkedList sl=new SinglyLinkedList();
		ListNode head=new ListNode(10);
	ListNode newhead=sl.insertbeg(head, 12);
	ListNode newhead1=	sl.insertbeg(head, 89);
	ListNode newhead2=sl.insertbeg(head, 90);
	ListNode newhead3=sl.insertbeg(head, 90);
	ListNode newhead4=sl.insertbeg(head, 90);
	sl.removeDuplicates(head);
	
	
	
		sl.display(head);

		
		/*sl.display(head);
	head =sl.insertAtPos(head, 5, 15);
		sl.display(head);*/
				
		
	}
}