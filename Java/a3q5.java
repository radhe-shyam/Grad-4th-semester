//Assignment#3
//Designed to check the given string is palindrome or not
//Designed by Radhe shyam Jangid
//Date 10/8/2010
class a3q5
	{
	public static void main (String arg[])
	  {
	  int n,i,j;
	  n=arg[0].length();
	  for(i=0,j=n-1;i<n;i++,j--)
	    {
	    if(arg[0].charAt(i)!=arg[0].charAt(j))
		{
		System.out.println("This string is not a palindrome string");
		return;
		}	
	    }
	    System.out.println("This string is palindrome string");
	    }
	  }

/*Output: -

Z:\Java>java a3q5 arora
This string is palindrome string

*/
