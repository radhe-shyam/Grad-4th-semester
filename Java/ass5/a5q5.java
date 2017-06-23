/*	Assignment 5 
Created by Vijay Arora.
Q5=WAP in JAVA which create following inherit class structure : 
*/
class Person
{
 String name,fname;
 void pr( )
    {
      name="Vijay";
      fname="Rambabu JI";
      System.out.println("Name :  "+name);
      System.out.println("Father name :  "+fname);
     }
 }

class Students extends Person
{
 int rno;
 String clas;
 void st( )
  {
   rno=374;
  clas="BCA-4";
  System.out.println("Class :  "+clas);
  System.out.println("Student Roll no :  "+rno);
  }
}

class Exam extends Students 
{ 
  int m1,m2,m3,m4,per;
  void ex( )
   {
    m1=65;m2=85;m3=75;m4=66;
    per=(m1+m2+m3+m4)/4;
    System.out.println("Percentage is : "+per);
   }
 }

class Employee extends Person
{ 
  void fun4( )
   {
    
   } 
}

class Teaching extends Employee
 {  String degi;
    double salary;
   void te( )
  {
   salary=25000;
   degi="Teacher";
   System.out.println("Employee (Teaching) is : "+degi);
   System.out.println("Salary is : "+salary);
  }
}

class Nonteaching extends Employee
{ String degi;
  double salary; 
  void nt( )
  {
   salary=20000;
   degi="Management";
   System.out.println("Employee (Non-Teaching) is releted to : "+degi);
   System.out.println("Salary is : "+salary);  
  } 
}

class A55
{
  public static void main(String arr[])
    {
         Nonteaching ob1= new Nonteaching();
         Teaching ob2 = new Teaching();
         Exam ob3 = new Exam();
         System.out.println("     Student   ");
         ob3.pr( );
         ob3.st( );
         ob3.ex( );
         System.out.println("\n");
         System.out.println("     Employee    ");        
         ob2.pr( );
         ob2.te( );
         ob1.nt( );	      
     }
   }

