/*
Name	: Jaideep Charan
date	: 13/8/10
Object 	: WAP in JAVA which accept a string as command line and
	 count number of vovels in it.
*/

class a3q1
{
	public static void main(String arg[])
	{
		int i,ln,vol=0;
		char a;
		ln=arg[0].length();
		for(i=0;i<ln;i++)
		{
			switch(arg[0].charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vol++;
			}
		}
		System.out.print("Number of vowel in given string is = "+vol);
	}
}


/*
		Output

Z:\>java a3q1 india
Number of vowel in given string is = 3
Z:\>java a3q1 Jaideep
Number of vowel in given string is = 4

*/	