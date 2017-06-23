//Assignment#2
//Designed to print given range of prime numbers
//Designed by Radhe shyam Jangid
//Date 26/7/2010
class a2q2
        {
        public static void main (String arg[])
        {
        int a=5,b=15,s=0,i,j;
        for(j=a;j<=b;j++)
		{
		for(i=2;i<j-1;i++)
        		{
			if((j%i)==0)
			s++;
			}
			if(s==0)
			System.out.println(j);
			s=0;
		}
	
        }
        }

/*
Output: -

5
7
11
13
*/

