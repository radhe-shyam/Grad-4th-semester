//Designed to delete the duplicate elements from an array
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo5
{
	public static void main(String arg[])
	{
	int a[],i,j,k,n,r=1;
	n=arg.length;
	a=new int[n];
	for(i=0;i<n;i++)
	a[i]=Integer.parseInt(arg[i]);
	for(i=0;i<n-1;i++)
		{
		for(j=i+1;j<n;j++)	
			{
			if(a[i]==a[j])
				{
				System.out.println(i+" "+j);
				for(k=j;k<n-r;k++)
					a[k]=a[k+1];
				r++;
				}
			}
		}
	for(i=0;i<n-r;i++)
	System.out.println(a[i]);
	}
}
