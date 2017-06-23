//Assignment #6
//Designed to reads two numbers from the keyboard and print addition, subtraction, division and multiplication of the numbers.
//Designed by Radhe shyam Jangid
//Date 17/10/2010
import java.io.*;
class a6q4
{
	public static void main(String arg[])throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.print("Enter 1st numbers : - ");
	int a=Integer.parseInt(br.readLine());
	System.out.print("Enter 2nd numbers : - ");
	int b=Integer.parseInt(br.readLine());
	System.out.println("\nAddition : "+(a+b));
	System.out.println("Subtraction : "+(a-b));
	System.out.println("Multiplication : "+(a*b));
	System.out.println("Division : "+(a/b));
	}
}

//Output: -
//Z:\Java>java a6q4
//Enter 1st numbers : - 54
//Enter 2nd numbers : - 2

//Addition : 56
//Subtraction : 52
//Multiplication : 108
//Division : 27