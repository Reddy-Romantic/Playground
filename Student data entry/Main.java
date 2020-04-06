#include <iostream>
#include<string>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s;
   int r;float m;
  //char str[50];
  cin.getline(s.name,50);
   cin>>r>>m;
  //s.name=str;
  s.roll=r;
  s.marks=m;
  cout<<endl<<"Student Details"<<endl;
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks;

  
}