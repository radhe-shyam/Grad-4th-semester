//Assignment #5
//Designed to create 2D matrix class
//Designed by Radhe Shyam Jangid
//Date 21/9/2010
class Mmatrix 
	{
	int m[][];
	Mmatrix(int x)
		{
		m=new int[3][3];	
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				m[i][j]=i+j+x;
			}
		}
	
	void pmatrix()
		{
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				System.out.print("\t"+m[i][j]);
			System.out.print("\n");
			}
		}
	Mmatrix amatrix(Mmatrix m2)
		{
		Mmatrix m3=new Mmatrix(0);
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				m3.m[i][j]=m[i][j]+m2.m[i][j];	
			}
		System.out.println("Result Matrix after Addition : -");
		return m3;
		}
	Mmatrix smatrix(Mmatrix m2)
		{
		Mmatrix m4=new Mmatrix(0);
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				m4.m[i][j]=m[i][j]-m2.m[i][j];	
			}
		System.out.println("Result Matrix after Subtraction : -");
		return m4;
		}
	Mmatrix mmatrix(Mmatrix m2)
		{
		Mmatrix m5=new Mmatrix(0);
		for(byte i=0;i<3;i++)
			{
			for(byte j=0;j<3;j++)
				{
				m5.m[i][j]=0;
				for(byte k=0;k<3;k++)
					{
					m5.m[i][j]=m5.m[i][j]+(m[i][k]*m2.m[k][j]);
					}
				}
			}
		System.out.println("Result Matrix after multiplication : -");
		return m5;
		}
	}
class a5q3
	{
	public static void main(String arg[])
		{
		Mmatrix m1=new Mmatrix(5);
		Mmatrix m2=new Mmatrix(10);
		Mmatrix m3,m4,m5;
		System.out.println("First matrix : -");
		m1.pmatrix();
		System.out.println("Second matrix : -");
		m2.pmatrix();
		m3=m1.amatrix(m2); 
		m3.pmatrix();		
		m4=m1.smatrix(m2);
		m4.pmatrix();
		m5=m1.mmatrix(m2);
		m5.pmatrix();
		
		}
	}

Output: -

//Z:\Java>java a5q3
//First matrix : -
//        5       6       7
//        6       7       8
//        7       8       9
//Second matrix : -
//        10      11      12
//        11      12      13
//        12      13      14
//Result Matrix after Addition : -
//        15      17      19
//        17      19      21
//        19      21      23
//Result Matrix after Subtraction : -
//        -5      -5      -5
//        -5      -5      -5
//        -5      -5      -5
//Result Matrix after multiplication : -
//        200     218     236
//        233     254     275
//        266     290     314