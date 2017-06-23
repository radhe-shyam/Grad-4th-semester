//Assignment #5
//Program which has a class Myclass which have methods fact(int),table(int)
//	and define main and call those methods without creating the objects.
//Designed by Radhe Shyam Jangid
//Date 4/10/2010
class Myclass
{
	static void table(int num)
		{
		for(byte i=1;i<11;i++)
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	static void fact(int num)
		{
		int f=1;
		while(num>1)
			{
			f=f*num;
			num--;
			}
		System.out.println("\nFactorial is "+f);
		}		
}
class a5q1
{
public static void main(String arg[])
	{
	Myclass.table(5);
	Myclass.fact(5);
	}
}

//Output: -
//Z:\Java>java a5q1
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15
//5 x 4 = 20
//5 x 5 = 25
//5 x 6 = 30
//5 x 7 = 35
//5 x 8 = 40
//5 x 9 = 45
//5 x 10 = 50

//Factorial is 120