import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int s=0;
		int start=0;
		int end=0;
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max_so_far = Integer.MIN_VALUE;
		int max_ending=0;
		for(int i=0;i<arr.length;i++)
		{
			 max_ending= max_ending+arr[i];
			 
			 if(max_so_far< max_ending)
			 {
				 max_so_far=max_ending;
				 start=s; end=i;
			 }
			 if( max_ending<0)
			 {
				 max_ending=0;
				 s=i+1;
			 }
			 
		}
		
		System.out.println(max_so_far);
		
	}

}
