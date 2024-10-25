#include<iostream.h>
#include<conio.h>

class Person
{
	protected:
		char name[20];
	public:
		void input();
		void display();
};

class Student : public Person
{

};

void Person:: input()
{
	cout<<"Enter your name: ";
	cin>>name;
}

void Person :: display()
{
	cout<<"Name= "<<name<<endl;
}

void main()
{
	Student s;
	clrscr();
	s.input();
	s.display();
}