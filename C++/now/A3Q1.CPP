#include<iostream.h>
#include<conio.h>
class test
{
	public:
	void inl();
};
inline void test::inl()
{
	cout<<"This is an Inline function";
}
void main()
{
clrscr();
test obj;
obj.inl();
getch();
}