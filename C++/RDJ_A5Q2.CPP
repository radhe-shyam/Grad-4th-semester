#include<iostream.h>
#include<conio.h>
class fi
{
public:
virtual void display()
{
cout<<"1 display"<<endl;
}
void show()
{
cout<<"1 show"<<endl;
}
};
class se:public fi
{
public:

void display()
{
cout<<"2 display"<<endl;
}
void show()
{
cout<<"2 show"<<endl;
}
};
void main()
{
fi f;
se s;
f.display();
f.show();
s.display();
s.show();
fi *ptr;
ptr=&f;
ptr->display();
ptr->show();
ptr=&s;
ptr->display();
ptr->show();
getch();
}