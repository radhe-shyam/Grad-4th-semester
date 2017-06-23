//Assignment #4
//Designed to create a class student
//Designed by Radhe Shyam Jangid
//Date 13/9/2010
class student
{
	int rn,m1,m2,m3,per;
	String a,d;
	student(String b, int n, int n1, int n2, int n3)
	{
	a=b;
	rn=n;
	m1=n1;
	m2=n2;
	m3=n3;
	calculate(m1,m2,m3);
	}
	void display()
	{
	System.out.println(rn+"\t"+a+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+d+"\t"+per);
	}
	void calculate(int n1, int n2, int n3)
	{
	per=(n1+n2+n3)/3;
	if(per>59)
		d="First";
	else if(per>45 && per<60)
		d="Second";
	else if (per>36 && per<46)
		d="Third";
	else
		d="Fail";
	}
}
class a4q2
{
	public static void main(String arg[])
	{
	student s1=new student("abc",1,40,40,40);
	student s2=new student("def",2,60,60,60);
	student s3=new student("ghi",3,35,35,35);
	System.out.println("Roll NO\t"+"Name\t"+"Sub1\t"+"Sub2\t"+"Sub3\t"+"Div\t"+"Percentage");
	s1.display();
	s2.display();
	s3.display();
	}
}
//Output: -

//Roll NO Name    Sub1    Sub2    Sub3    Div     Percentage
//1       abc     40      40      40      Third   40
//2       def     60      60      60      First   60
//3       ghi     35      35      35      Fail    35

