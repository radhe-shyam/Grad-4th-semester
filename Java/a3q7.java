//Assignment#3
//Designed to display the string with Upper case, Proper case and lower case
//Designed by Radhe shyam Jangid
//Date 17/8/2010
class a3q7
	{
	public static void main (String arg[])
		{
		int n,i;
		char l;
		n=arg[0].length();
		System.out.print("In Upper case  = ");
		for(i=0;i<n;i++)
			{
			l=arg[0].charAt(i);
			if(l>='a'&& l<='z')
				l-=32;
			System.out.print(l);
			}
		System.out.print("\nIn Proper case = ");
		l=arg[0].charAt(0);
		if(l>='a'&& l<='z')
			l-=32;
		System.out.print(l);
		for(i=1;i<n;i++)
			{
			l=arg[0].charAt(i);
			if((l<='Z')&&(l>='A'))
				l+=32;
			System.out.print(l);
			}
		System.out.print("\nIn Lower case  = ");
		for(i=0;i<n;i++)
			{
			l=arg[0].charAt(i);
			if((l<='Z')&&(l>='A'))
				l+=32;
			System.out.print(l);
			}
		}
	}

/*Output: -

Z:\Java>java a3q7  jangid
In Upper case  = JANGID
In Proper case = Jangid
In Lower case  = jangid

*/