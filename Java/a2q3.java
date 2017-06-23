//Assignment#2
//Designed to print sum of any number
//Designed by Radhe shyam Jangid
//Date 26/7/2010
class a2q3
        {
        public static void main (String arg[])
        	{
        	int a=9829,b,sum=0,i;
		b=a;
		while(a!=0)
			{
			i=a%10;
			a=a/10;
			sum=sum+i;
			}
		System.out.println("Sum of digit of "+b+" is "+sum);      
        	}
        }

/*
Output: -

Sum of digit of 9829 is 28
*/
