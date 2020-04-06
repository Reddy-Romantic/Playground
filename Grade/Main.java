#include<iostream>
#include<string>
#include<iterator>
using namespace std;
class Person{
    
};
class Student : public Person
{
	public:
    int cal(int z){
    if(z>=90 )
    cout<<"O";
    else if(z>=80 )
    cout<<"E";
    else if(z>=70 )
    cout<<"A";
    else if(z>=55)
    cout<<"P";
    else if(z>=45 )
    cout<<"D";
    else
    cout<<"T";
    }
};
int main()
{
  Student n;
  string a,b;
  cin>>a>>b;
  cout<<a<<endl<<b<<endl;
  int c,d;
  cin>>c>>d;
  cout<<c<<endl;
  int e[d] ;
  int s=0;
  for(int i=0;i<d;i++){
    cin>>e[i];
    s+=e[i];}
  s=s/d;
 
  n.cal(s); 
}