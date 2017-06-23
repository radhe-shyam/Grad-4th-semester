/*
Name	: Jaideep Charan
date	: 13/8/10
Object 	: WAP in JAVA which accept a string as emailid from command line and
	 check whether its format is coorect or not.
*/

class a3q3
{
	public static void main(String arg[])
	{
		char a;
		int ln,i,x=0,y=0,z=0,w=0;
		ln=arg[0].length();
		for(i=0;i<ln;i++)
		{
			a=arg[0].charAt(i);
			if(a=='@') x++;
			else if(a=='.') y++;
			else if((a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9'))
				z++;
			else 
				w++;
		}
		if(x==1 && y==1 && w==0)
			System.out.println("Your Email format is correct");
		else
			System.out.println("Your Email format is not correct");
	}
}


/*
		Output


Z:\>javac a3q3.java

Z:\>java a3q3 jdc@nagaur.com
Your Email format is correct

Z:\>java a3q3 lips@yahoo.com
Your Email format is correct

Z:\>java a3q3 lips@yahoo@jodhpur.com
Your Email format is not correct

Z:\>java a3q3 lips@yahoo.jodhpur.com
Your Email format is not correct

*/