 class CircularSinglyLinkedList
{
	private ListNode last;
	private int length;
	public CircularSinglyLinkedList()
	{
		last = null;
		length = 0;
	}
	
	private class ListNode
	{
		private ListNode next;
		private int data;
		
		public ListNode(int data)
		{
			this.data=data;
		}
		
	}
	public boolean isEmpty()
	{
		if(length == 0)
		{
			return true;
		}
		return false;
	}
	public void display()
	{
		if(last == null)
		{
			return;
		}
		ListNode first=last.next;
		while(first!= last)
		{
			System.out.print(first.data+"->");
			first = first.next;
		}
		System.out.print(first.data);
	}
	 void insertAtfirst(int data)
	 {
		 ListNode temp = new ListNode(data);
		 if(isEmpty())
		 {
			 last = temp;
		 }
		 else {
			 temp.next= last.next;
		 }
		 last.next = temp;
		 length++;
	 }
	

 void insertAtend(int data)
 {  ListNode temp = new ListNode(data);
	 if(isEmpty())
	 {
		 last = temp;
		 last.next = last;
	 }
	 else
	 {
		 temp.next=last.next;
		 last.next = temp;
		 last = temp;
		 length++;
	 }
 }
ListNode deletefirst()
 {
	 if(isEmpty())
	 {
		 System.out.print("list is empty");
	 }
	 ListNode temp=last.next;
	 if(last.next == last)
	 {
		 last = null;
	 }
	 else
	 {
		 last.next=temp.next;
	 }
	 temp.next=null;
	 return temp;
	 
 }


}



public class CircularSingly {

	public static void main(String[] args) {
		CircularSinglyLinkedList cls=new CircularSinglyLinkedList();
	cls.insertAtfirst(34);
	cls.insertAtfirst(45);
	cls.insertAtfirst(12);
	cls.insertAtfirst(17);
	cls.insertAtend(90);
	cls.insertAtend(67);
	cls.insertAtend(56);
	cls.deletefirst();
	cls.deletefirst();
	cls.deletefirst();
	cls.deletefirst();
	cls.deletefirst();
	cls.deletefirst();
	
	cls.display();

	}

}