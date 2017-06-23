//Assignment#3
//Designed to print the number of vowel from a string
//Designed by Radhe shyam Jangid
//Date 2/8/2010
class a3q1
        {
        public static void main (String arg[])
        {
	int n,c=0,i;
	n=arg[0].length();
	for(i=0;i<n;i++)
		{
		char a=arg[0].charAt(i);
		if ((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
		c++;
		}
	System.out.println("This string has "+c+" vowels");
        }
        }

//OUtput: -
//This string has 2 vowels

