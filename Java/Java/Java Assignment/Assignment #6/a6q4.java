/*
Assignment #6 Question No: 4
Name	: Jaideep CharaN
date	: 25/10/10
Object 	: WAP in JAVA which reads two numbers from the keyboard and print addition,
	 subtraction, division and multiplication of the numbers.
*/

import java.io.*;
class a6q4 
{
	public static void main (String arg[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.print("Enter First Value: ");
		String n1 = br.readLine();
		System.out.print("Enter Second Value: ");
		String n2 = br.readLine();
		int a=Integer.parseInt(n1);
		int b=Integer.parseInt(n2);
		System.out.print("Addition is = " + (a+b) +"\n");
		System.out.print("Subtraction is = " + (a-b)+"\n");
		System.out.print("Multiplication is = " + (a*b)+"\n");
		System.out.print("Division is = " + (a/b)+"\n");
		System.out.print("Modulas is = " + (a%b));
	}
}

/*
		Output

Z:\>java a6q4
Enter First Value: 10
Enter Second Value: 2
Addition is = 12
Subtraction is = 8
Multiplication is = 20
Division is = 5
Modulas is = 0
Z:\>java a6q4
Enter First Value: 15
Enter Second Value: 4
Addition is = 19
Subtraction is = 11
Multiplication is = 60
Division is = 3
Modulas is = 3

*/