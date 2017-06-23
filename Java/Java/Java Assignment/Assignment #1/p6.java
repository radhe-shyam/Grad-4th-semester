/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find given character is alphabate,digit or Symbol.
*/

class p6
{
   public static void main(String arg[])
   {
       
      char ch;
      ch=arg[0].charAt(0);
      System.out.println("The enterd character is  "+ch);
      if(ch >= 'a'&& ch<= 'z')
      System.out.println("The enterd character is alphbates");
      else if(ch >= '1'&& ch<='9')
      System.out.println("The enterd character is digit");
      else if(ch >= 'A'&& ch<='Z')
      System.out.println("The enterd character is alphbates");
      else
      System.out.println("The enterd character is symbol");
         
    }
}

/*

      ------- Output ------


Z:\Java>javac p6.java

Z:\Java>java p6 7
The enterd character is  7
The enterd character is digit

Z:\Java>java p6 a
The enterd character is  a
The enterd character is alphbates


Z:\Java>java p6 $
The enterd character is  $
The enterd character is symbol

*/




