//Assignment#6
//Designed to demonstrate exception handling
//Designed by Radhe shyam jangid
import java.lang.*;
class A62
{
public static void main (String ar[])
{
try{int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);

int c=a/b;
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Please correct array");
}
catch(ArithmeticException e)
{
System.out.println("Error in no.");
}
catch(Exception e)
{
System.out.println("Error");
}
}
}
/*
Output:-
Z:\Java\ass6>java A62 5 2

Z:\Java\ass6>java A62
Please correct array

Z:\Java\ass6>java A62 5 0
Error in no.
*/
