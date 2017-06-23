/*
Name	: Jaideep Charan
date	: 13/8/10
Object 	: WAP in JAVA which accept a string as command line and 
	count alphabets, digits and special symbols in it.
*/
class a3q2
{
	public static void main(String arg[])
	{
		int i,ln,al=0,sp=0,di=0;
		char a;
		ln=arg[0].length();
		for(i=0;i<ln;i++)
		{
			a=arg[0].charAt(i);
			if((a>='a' && a<='z') || (a>='A' && a<='Z'))
				al++;
			else if(a>='0' && a<='9')
				di++;
			else
				sp++;
		}
		System.out.println("Number of Alphabets in given string is:\t"+al);
		System.out.println("Number of Digits in given string is:\t"+di);
		System.out.println("Number of Special Symbol in given string is:\t"+sp);
	}
}

/*
		Output


Z:\>java a3q2 ind123**
Number of Alphabets in given string is: 3
Number of Digits in given string is:    3
Number of Special Symbol in given string is:    2

Z:\>java a3q2 ind[]new45
Number of Alphabets in given string is: 6
Number of Digits in given string is:    2
Number of Special Symbol in given string is:    2

*/