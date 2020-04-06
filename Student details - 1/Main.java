#include<iostream>
struct stud1
{
  int age;
  char name[101];
  char name2[101];
  int std;
};
int main(){
  struct stud1 s;
  std::cin>>s.age>>s.name>>s.name2>>s.std;
  std::cout<<s.age<<" "<<s.name<<" "<<s.name2<<" "<<s.std;
 
 
}

