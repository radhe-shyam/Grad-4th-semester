//Assignment#3
//Designed to check the given  two string are same or not
//Designed by Radhe shyam Jangid
//Date 16/8/2010
class a3q6
	{
	public static void main (String arg[])
		{
		int n,i,j,n1;
		n=arg[0].length();
		n1=arg[1].length();
		if(n1!=n)
			{
			System.out.println("Strings are not same");
			return;
			}
		for(i=0,j=0;i<n;i++,j++)
			{
			if(arg[0].charAt(i)!=arg[1].charAt(j))
				{
				System.out.println("Strings are not same");
				return;
				}	

			}
		System.out.println("String are same");
		}
	}

/*Output: -

Z:\Java>java a3q6 arora jangid
Strings are not same

*/