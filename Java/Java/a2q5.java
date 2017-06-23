//Assignment#2
//Designed to display the * format
//Designed by Radhe shyam Jangid
//Date 26/7/2010
class a2q5
        {
        public static void main(String arg[])
	        {
        	int i=5,j=5;
        	for(i=1;i<6;i++)
        		{
        		for(j=5;j>=i;j--)
       				 System.out.print("*");
        		System.out.println();
        		}

	        for(i=2;i<6;i++)
        		{
        		for(j=1;j<=i;j++)
       				 System.out.print("*");
        		System.out.println();
        		}
        	}
        }

/*
Output: -

*****
****
***
**
*
**
***
****
*****
*/