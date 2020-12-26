
public class Practice2 
{
	public static void main(String args[])
	{
	  System.out.print(isRotated("ABCD","BCDA"));
	}
	public static boolean isRotated(String str,String rotatedstring)
	{
		if(str==null || rotatedstring== null)
		{
			return false;
		}
		else if(str.length()!=rotatedstring.length())
		{
			return false;
		}
		else
		{
			String concatenated=str+str;
			return concatenated.contains(rotatedstring);
		}
	}

}