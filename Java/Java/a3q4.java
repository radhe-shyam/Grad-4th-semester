//Assignment#3
//Designed to accept two string as mainstring and substring, is in main or not
//Designed by Radhe shyam Jangid
//Date 10/08/2010
class a3q4
	{
	public static void main(String arr[])
	{
	int n,n1,i,j,r=0;
	n1=arr[0].length();
	n=arr[1].length();
	if(n1<=n)
	  {
	  System.out.println("Main string should be greater than sub string");
	  return;
	  }
	if(n<2)
	  {
	  System.out.println("Sub string should be more than 1 character");
	  return;
	  }
	for(i=0;i<n1;i++)
	  {
	  if(((arr[0].charAt(i))==(arr[1].charAt(0)))&&((n1-i)>=n))
	    {
	    r=1;
	    i++;
	    for(j=1;j<n;j++,i++)
	      {
	      if((arr[1].charAt(j))==(arr[0].charAt(i)))
	      r++;					
	      }
	      if(r==n)
		{
		System.out.println("The sub string is a part of main string");
		return;
		}
	     }
           }
	System.out.println("The sub string is not a part of main string");
	}
	}

/*Output: -

Z:\Java>java a3q4 radheshyam radhe
The sub string is a part of main string

*/