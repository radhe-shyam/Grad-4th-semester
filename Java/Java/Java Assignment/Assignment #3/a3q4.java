/*
Name	: Jaideep Charan
date	: 13/8/10
Object 	: WAP in JAVA which accept two string as mainstring and substring ,
	 find whether substring is present in main or not.
*/

class a3q4
{
	public static void main(String arg[])
	{
		int l1=arg[0].length();
		int l2=arg[1].length();
		int flag=0;

		for(int i=0;i<l1;i++)
		{
			if(arg[0].charAt(i)==arg[1].charAt(0))
			{	
				int sb=0;

				while(sb<l2 && sb+i<l1) { if(arg[0].charAt(sb+i)!=arg[1].charAt(sb))	
							break;
					       else
							sb++;
					     }

				if(sb==l2) { flag=1;	break;  }	
			}	
		}
		if(flag==1)	
			System.out.println("Substring is present.");
		else
			System.out.println("Substring is not present.");			

	}


}

/*  =====  Output =====


Z:\>javac a3q4.java

Z:\>java a3q4 India nd
Substring is present.

Z:\>java a3q4 India ni
Substring is not present.

Z:\>java a3q4 India Ind
Substring is present.

Z:\>java a3q4 India Inda
Substring is not present.


*/