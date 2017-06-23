/*
Name	: Jaideep Charan
date	: 21/8/10
Object 	:WAP in JAVA which accept two string and find whether both are same or not.
*/

class a3q6
{
	public static void main(String arg[])
	{
		int l1=arg[0].length();
		int l2=arg[1].length();
		int flag=0;		
		if(l1!=l2)
		{
			System.out.println("Both String are not same.");							
		}	
		else
		{
			for(int i=0;i<l1;i++)
			{					
				if(arg[0].charAt(i)==arg[1].charAt(0))
				{	
					int sb=0;
					while(sb<l2) { if(arg[0].charAt(sb+i)!=arg[1].charAt(sb))
								break;
						       else
								sb++;
						     }
					if(sb==l2) { flag=1;	break;  }
				}	
			}		
			if(flag==1)	
				System.out.println("Both string are same.");
			else
				System.out.println("Both String are not same.");
		}				
	}
}



/*
		Output


Z:\>java a3q6 jaideep india
Both String are not same.

Z:\>java a3q6 jaideep jaideep
Both string are same.

Z:\>java a3q6 jaideep jai
Both String are not same.

Z:\>java a3q6 india india
Both string are same.

Z:\>java a3q6 india ind
Both String are not same.

*/