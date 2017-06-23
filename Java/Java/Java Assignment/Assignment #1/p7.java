/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find division.
*/

class p7
{
   public static void main(String arg[])
   {
       
      float per;
      per=Float.parseFloat(arg[0]);
      if(per >= 60 && per<= 100)
      System.out.println("First Division");
      else if(per >= 45 && per<=59)
      System.out.println("Second Division");
      else if(per >= 36 && per<=44)
      System.out.println("Thrid Division");
      else
      System.out.println("Fail");
         
    }
}

/*

      ------- Output ------

   
Z:\Java>javac p7.java

Z:\Java>java p7 55.5
Second Division

Z:\Java>java p7 85.5
First Division

Z:\Java>java p7 33.3
Fail

Z:\Java>java p7 42.5
Thrid Division
   

*/


