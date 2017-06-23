//Assignment#2
//Designed to find palindrome number
//Designed by Radhe shyam Jangid
//Date 27/7/2010
class a2q4
        {
        public static void main(String arg[])
        {
        int a=121,b,i,sum=0;
	b=a;
	while(a!=0)
	  {
	   i=a%10;
	   a=a/10;
	   sum=(sum*10)+i;
	  }
	if (sum==b)
	  System.out.print(b+" is a palindrome number");
	else
	  System.out.print(b+" is not a palindrome number");
        }
        }

/*
Output: -

121 is a palindrome number
*/
