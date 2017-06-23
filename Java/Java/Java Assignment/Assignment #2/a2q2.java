/*
Name:	Jaideep Charan
Date:	24 July, 2010
Object:	WAP in JAVA to print prime numbers of given range
*/


class a2q2
{
	public static void main(String arg[])
	{
		int a,b,c=0,i,j;
		a = Integer.parseInt(arg[0]);
		b = Integer.parseInt(arg[1]);
		for(i=a;i<=b;i++)
		{
			c = 0;
			for(j=2;j<=i/2;j++)
			{		
				if(i%j==0) c++;
			}
			if(c==0) 
				System.out.println("Prime Number "+i);
		}
	}
}

/*

		Output

Z:\>java a2q2 2 50
Prime Number 2
Prime Number 3
Prime Number 5
Prime Number 7
Prime Number 11
Prime Number 13
Prime Number 17
Prime Number 19
Prime Number 23
Prime Number 29
Prime Number 31
Prime Number 37
Prime Number 41
Prime Number 43
Prime Number 47


*/
