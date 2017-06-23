//Assignment #5
//Designed to demonstrate dynamic method dispatch and overriding. 
//Designed by Radhe Shyam Jangid
//Date 5/10/2010
abstract class person{
	String name,fname;
	person(){
	name="Radhe";
	fname="Mr. Gopal ram";
	}
	person(String n, String f){
	name=n;
	fname=f;
	}
	abstract void read();
	abstract void display();
}
class student extends person{
	String cls;
	int rno;
	student(){
	super();
	cls="BCA-IV";
	rno=987;
	}
	student(String n, String f, String c, int r){
	super(n,f);
	cls=c;
	rno=r;
	}
	void read(){
	name="Ayush";
	fname="Mr. Ram kishore";
	cls="BCA-II";
	rno=789;
	}
	void display(){
	System.out.println("\t+++Student's Details+++");
	System.out.println("Name : "+name);
	System.out.println("Father's Name : "+fname);
	System.out.println("Roll no : "+rno);
	System.out.println("Class ; "+cls);
	}
}
class teacher extends person{
	String qual;
	int sal;
	teacher(){
	super();
	qual="B.com";
	sal=10000;
	}
	teacher(String n, String f, String q, int s){
	super(n,f);
	qual=q;
	sal=s;
	}
	void read(){
	name="Piyush";
	fname="Mr. Swaroop kishore";
	qual="B.com";
	sal=10000;
	}
	void display(){
	System.out.println("\n\t+++Teacher's Details+++");
	System.out.println("Name : "+name);
	System.out.println("Father's Name : "+fname);
	System.out.println("Qualification : "+qual);
	System.out.println("Salary ; "+sal);
	}
}
class a5q4{
public static void main(String arg[]){
	student s=new student();
	teacher t=new teacher();
	s.display();
	t.display();	
	}
}

//Output: -
//Z:\Java>java a5q4
//        +++Student's Details+++
//Name : Radhe
//Father's Name : Mr. Gopal ram
//Roll no : 987
//Class ; BCA-IV

//        +++Teacher's Details+++
//Name : Radhe
//Father's Name : Mr. Gopal ram
//Qualification : B.com
//Salary ; 10000