//Assignment #6
//Designed to create a thread for printing 1 to 10. Demonstrate thread for three instances.
//Designed by Radhe shyam Jangid
//Date 16/11/2010
class Mythr extends Thread{
public void run(){
	for(byte i=1;i<11;i++)
		{
		System.out.println(i);
		try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class a6q3{
public static void main(String arg[]){
	Mythr t1=new Mythr();
	Mythr t2=new Mythr();
	Mythr t3=new Mythr();
	t1.start();
	t2.start();
	t3.start();
	}

}

//Output: -
//Z:\Java>java
//1
//1
//1
//2
//2
//2
//3
//3
//3
//4
//4
//4
//5
//5
//5
//6
//6
//6
//7
//7
//7
//8
//8
//8
//9
//9
//9
//10
//10
//10