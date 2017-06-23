//Assignment#6
//Designed to get input from keyboard
//Designed by Radhe shyam jangid
import java.io.*;
class A64 {
public static void main (String ar[])throws IOException
{
InputStreamReader inp=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(inp);
System.out.print("enter any no. = ");
String n = br.readLine();
System.out.print("enter any no. = ");
String m = br.readLine();
int a=Integer.parseInt(n);
int b=Integer.parseInt(m);
System.out.print("addition is = " + (a+b) +"\n");
System.out.print("subtraction is = " + (a-b)+"\n");
System.out.print("multiplication is = " + (a*b)+"\n");
System.out.print("division is = " + (a/b)+"\n");
System.out.print("modulas is = " + (a%b));
}
}
/*
Output:-
Z:\Java\ass6>java A64
enter any no. = 5
enter any no. = 2
addition is = 7
subtraction is = 3
multiplication is = 10
division is = 2
modulas is = 1
*/