
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(9);
		al.add(10);
		al.add(19);
		al.add(24);
		al.add(100);
		al.add(12);
		al.add(89);
		al.add(23);
	//System.out.print(al);
		//List iterator
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext())
        {        	
        	Integer i=(Integer)itr.next();
        	if(i%2==0)
        	{
        		System.out.print(i+" ");
        	}
        	else
        	{
        		itr.remove();
        	}
        }

	}

}