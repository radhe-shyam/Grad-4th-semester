//Assignment#2
//Designed to print table of given range
//Designed by Radhe shyam Jangid
//Date 26/7/2010
class a2q1
        {
        public static void main (String arg[])
        {
        int a=5,b=10,i,j;
	for(j=1;j<11;j++)
		{
        	for(i=a;i<=b;i++)
	        System.out.print((i*j)+"\t");
		System.out.println();
        	}
	}
        }

/*
Output: -

5       6       7       8       9       10
10      12      14      16      18      20
15      18      21      24      27      30
20      24      28      32      36      40
25      30      35      40      45      50
30      36      42      48      54      60
35      42      49      56      63      70
40      48      56      64      72      80
45      54      63      72      81      90
50      60      70      80      90      100
*/