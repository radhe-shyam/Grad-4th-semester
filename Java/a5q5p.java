
abstract class my{
                                int age;
                                String name,add;
                                abstract  void read(String n,int a,String ad);
                                abstract void display();
                               }
 class stu extends my{
                  int rno,s1,s2,s3;
                  stu(int r,int m1,int m2,int m3){
                                                   rno=r;
                                                   s1=m1;
                                                   s2=m2;
                                                   s3=m3;
                                                         }              
                  void read(String n,int a,String ad){
                                                        name=n;
                                                        age=a;
                                                        add=ad;
                                                                }
                 void display(){
                                         System.out.print("\n===============================");
                                         System.out.println("\ndetails of the student = ");
                                         System.out.print("\n===============================");
                                         System.out.print("\nname = "+name);
                                         System.out.print("\nroll no = "+rno);
                                         System.out.print("\naddress = "+add);
                                         System.out.print("\nage = "+age);
                                         System.out.print("\nMARKS = ");
                                         System.out.println("\nC++\tJava\tDBMS");                                         
                                         System.out.print("\n"+s1+"\t"+s2+"\t"+s3);
                                         }
                }
class t extends my{
        String cou,qu,b;
        t(String co,String q,String b1){
                                       cou=co;
                                       qu=q;
                                       b=b1;
             }
            void read(String n,int a,String ad){
                                                name=n;
                                                age=a;
                                                add=ad;
                                                       }
            void display(){
                           System.out.print("\n===============================");
                           System.out.print("\n\ndetails of the teacher = ");
                           System.out.print("\n===============================");
                           System.out.print("\nname = "+name);                           
                           System.out.print("\naddress = "+add);
                           System.out.print("\nage = "+age);
                           System.out.print("\nCourse teaching = "+cou);
                           System.out.print("\nQualification = "+qu); 
                           System.out.println("\nbranch = "+b);                                                                      
                          }
}

class Dis{
 public static void main(String ar[])
  {
    stu ob=new stu(1,20,30,40);
    ob.read("ABC",19,"chb");
    ob.display();
    t o=new t("BCA","MCA","paota");
    o.read("pqr",27,"basni");
    o.display();
  }
 } 
/*output:-

Z:\java\assign 5>javac a5q5.java

Z:\java\assign 5>java Dis

===============================
details of the student =

===============================
name = ABC
roll no = 1
address = chb
age = 19
MARKS =
C++     Java    DBMS

20      30      40
===============================

details of the teacher =
===============================
name = pqr
address = basni
age = 27
Course teaching = BCA
Qualification = MCA
branch = paota
*/
