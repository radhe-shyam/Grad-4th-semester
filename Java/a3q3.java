//Designed to check the email-id format
//Designed by Radhe shyam Jangid
//Date 2/8/2010
class a3q3
        {
        public static void main (String arg[])
        {
	int n,i,d=0,b=0,s=0,r=0,m=0,j=0,k=0,f=0,f1=0;
	char a;
	n=arg[0].length();
	for(i=0;i<n;i++)
		{
		a=arg[0].charAt(i);
                if((a>'0') && (a<='9'))
                	d++;
		else if (((a>='a') && (a<='z')) || ((a>='A') && (a<='Z')))
                	b++;
		else
	                {
			s++;
			if(a=='@')
				{
				r++;
				f=i;
				}
			else if(a=='.')
				{
				m++;
				f1=i;
				}
			else if(a=='_')
				j++;
			else
				k++;
			}
		}
	if((r>=1)&&(m>=1)&&(j>=0)&&(k<1)&&((f1-f)>3))
		System.out.println("Valid email-id");
	else
		System.out.println("email-id is not valid");
	}
        }

//Output: -
//Z:\Java>java a3q3 radhe_the_rdj@gmail.com
//Valid email-id