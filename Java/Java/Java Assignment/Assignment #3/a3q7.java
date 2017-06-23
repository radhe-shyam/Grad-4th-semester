/*
Name	: Jaideep Charan
date	: 21/8/10
Object 	: WAP in JAVA which accept a string as command line and 
	  display it with UpperCase, ProperCase and LowerCase. 
*/

class a3q7
{
  	public static void main(String arg[])
  	{
    		char c;
    		int i,n;
    		n=arg[0].length();    
		System.out.print("String in Upper Case : ");
		for(i=0;i<n;i++)
		{ 
			c=arg[0].charAt(i);
			if(c>='a' && c<='z')	
		  	{    	 	    	
	     			c-=32;
	     			System.out.print(c);
			}
	  		else
	    			System.out.print(c);
		}
		System.out.print("\nString in Lower Case : ");
		for(i=0;i<n;i++)
		{ 
	  		c=arg[0].charAt(i);
	  		if(c>='A' && c<='Z')	
	  		{    	 	    	
	     			c+=32;
	     			System.out.print(c);
			}
	  		else
	    		System.out.print(c);
		}
		System.out.print("\nString in Proper Case : ");
		for(i=0;i<n;i++)
		{ 
	  		c=arg[0].charAt(i);
	     		if(i==0)			  
  	     		{
	    			if(c>='a' && c<='z')	
		  		{    	 	    	
		     			c-=32;
	     	     			System.out.print(c);
				}
	  			else
	    	     			System.out.print(c);
	     		}
	     		else
		  	if(c>='A' && c<='Z')	
		  	{    	 	    	
		     		c+=32;
		     		System.out.print(c);
			}
		  	else
		       		System.out.print(c);	
		}
  	}
}

/*

		Output

Z:\>java a3q7 india
String in Upper Case : INDIA
String in Lower Case : india
String in Proper Case : India
Z:\>java a3q7 jaideep
String in Upper Case : JAIDEEP
String in Lower Case : jaideep
String in Proper Case : Jaideep

*/