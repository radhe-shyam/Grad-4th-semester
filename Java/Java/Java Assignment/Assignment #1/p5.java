/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find given character is vowel or consonent.
*/

class p5
{
   	public static void main(String arg[])
   	{       
      		char ch;
      		ch=arg[0].charAt(0);
      		System.out.println("The enterd character is  "+ch);
      		switch(ch)
      		{  
        		case 'a':
        		case 'A':
        		case 'e':
        		case 'E':
        		case 'i':
        		case 'o':
        		case 'O':
        		case 'u':
        		case 'U':          
               		{                 
                  		System.out.println(" The enterd character is vowel");
                  		break;
               		}
        		default:
                 		System.out.println("The enterd character is Consonent  ");              
                 
		}              
    	}
}

/*

      ------- Output ------


   
Z:\>java p5 a
The enterd character is  a
 The enterd character is vowel

Z:\>java p5 b
The enterd character is  b
The enterd character is Consonent

Z:\>java p5 A
The enterd character is  A
 The enterd character is vowel

*/


