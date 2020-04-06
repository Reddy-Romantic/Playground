#include<iostream>
#include<iomanip>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char designation[30];
  float salary;
}s;
int main()
{
  cout<<"Enter name:"<<endl;
  cin>>s.name;
  cout<<"Enter ID:"<<endl;
  cin>>s.id;
  cout<<"Enter age:"<<endl;
  cin>>s.age;
  cout<<"Enter designation:"<<endl;
  cin>>s.designation;
  cout<<"Enter Salary:"<<endl;
  cin>>s.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<s.name<<endl;
  cout<<"ID of the Employee : "<<s.id<<endl;
  cout<<"Age of the Employee : "<<s.age<<endl;
  cout<<"Designation of the Employee : "<<s.designation<<endl;
  cout<<"Salary of the Employee : "<<s.salary;
  
}