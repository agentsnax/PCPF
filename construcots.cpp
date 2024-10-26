#include <iostream.h>

#include<conio.h>

#include <string.h>

class Student

{

int roll_no;

char name[20];

public:

Student();

Student (int a, char *n);

Student (Student &s);

void input();

void display();

Student :: Student()

{

roll_no = 0;

name [0] = '10';
}

Student :: Student(int a, char *n)
{
roll no = a;
strcpy(name,n);
}

Student:: Student (Student &s)
{
roll_no = s_roll no;

strcpy (name, s.name); 
}




void Student:: input()
{
Cout << "Enter the roll numbe";

cin>> roll_no; 

Cout << "Enter the student name: ".

cin >> name:
}
void Student:: display ()
{
cout << "Roll no = " << roll_no <<endl;
cout << "Name = " << name << endl;
}
void main()

{
Student s1;

Student s1(10, "Shree");

Clrscr();

s1.display();

s1.input ();

s1. display();
Students3(s1);
s2.display();
s3.display();
}