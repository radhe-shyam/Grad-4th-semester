//Assignment#6
//Designed to demonstrate threading
//Designed by Radhe shyam jangid
class MyThread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.print("\b"i);
Thread.sleep(500);
}
}
class A63
{
public static void main (String a[])thrown IOException
{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
MyThread t3=new MyThread();
t1.start();
t2.start();
t3.start();
}
}
/*
Output:-
Z:\Java\ass6>java A63
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
*/