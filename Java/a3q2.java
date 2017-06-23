//Designed to print the number of alphabets, number and special symbol from a string
//Designed by Radhe shyam Jangid
//Date 2/8/2010
class a3q2
        {
        public static void main (String arg[])
        {
	int n,i,d=0,b=0,s=0;
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
                s++;
		}
	System.out.println("This string has "+d+" numbers, "+b+" alphabets and "+s+" Special symbols");
	}
        }

//Output: -
//Z:\Java>java a3q2 Bhavesh
//This string has 0 numbers, 7 alphabets and 0 Special symbols