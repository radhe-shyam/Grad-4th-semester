/*
Assignment #6 Question No: 3
Name	: Jaideep CharaN
date	: 25/10/10
Object 	: WAP in JAVA to create a thread for printing 1 to 10. 
	Demonstrate thread for three instances.
*/

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
		Thread.sleep(500);
	}
	MyThread()
	{
		super();
	}
}
class a6q3
{
	public static void main(String a[])thrown IOException
	{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}

/*	OUTPUT
Z:\>java a6q3
1
1
1
2
2
2
3
3
3
4
4
4
5
5
5
6
6
6
7
7
7
8
8
8
9
9
9
10
10
10
*/