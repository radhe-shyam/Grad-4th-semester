//Assignment #6
//Designed to perform exception handling
//Designed by Radhe shyam Jangid
//Date 17/10/2010
class a6q2
	{
	public static void main (String arg[])
		{
		int a,b,c=0;
		try{
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
			c=a/b;
		System.out.println("c = "+c);
			}
		catch(ArithmeticException e){
			System.out.println("Arithmatic error found");
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error found");
				}
		catch(Exception e){
			System.out.println("Error");
			}

		}
	}

//Output: -

//Z:\Java>java a6q2
//Array index error found

