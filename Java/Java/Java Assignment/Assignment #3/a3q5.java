/*
Name	: Jaideep Charan
date	: 13/8/10
Object 	: WAP in JAVA which accept a string as command line and check 
	whether it is palindrome or not.
*/

class a3q5
{
   public static void main(String arg[])
   {
      int f,ln,fl=0;
      ln=arg[0].length();
      ln--;
        for(f=0;f<(ln/2);f++,ln--)
	   {
		if(arg[0].charAt(f)!=arg[0].charAt(ln))
               {
                fl=1;
		break;
               }
	   }
        
       if(fl==0)
         System.out.println("The given string is Palindrom..");
       else
         System.out.println("The given string is not palindrom...");
   }

}

/*
      ------ output ------
  
Z:\>javac p5.java

Z:\>java p5 madam
The given string is Palindrom..

Z:\>java p5 jaideep
The given string is not palindrom...
*/