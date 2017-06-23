//Assignment #6
//Designed to Create a two classes IntStack and CharStack into a package Stack
//Designed by Radhe shyam Jangid
//Date 17/10/2010
import newpackage.IntStack;
import newpackage.CharStack;
class a6q1{
	public static void main(String arg[]){
	IntStack is=new IntStack(10);
	CharStack cs=new CharStack(10);
	int n=arg[0].length();
	for(byte i=0;i<n;i++)
		{
		char c=arg[0].charAt(i);
		is.push(c-48);
		cs.push(c);
		}
	for(byte i=0;i<n;i++)
		{
		is.pop();
		cs.pop();
		}
	}
}

//Output: -
//Z:\Java>java a6q1 1234
//Pushed in IntStack = 1
//Pushed in CharStack = 1
//Pushed in IntStack = 2
//Pushed in CharStack = 2
//Pushed in IntStack = 3
//Pushed in CharStack = 3
//Pushed in IntStack = 4
//Pushed in CharStack = 4
//Poped in IntStack = 4
//Poped from CharStack = 4
//Poped in IntStack = 3
//Poped from CharStack = 3
//Poped in IntStack = 2
//Poped from CharStack = 2
//Poped in IntStack = 1
//Poped from CharStack = 1