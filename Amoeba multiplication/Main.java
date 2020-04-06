#include<iostream>
using namespace std;
int main()
{
  int a=-1,b=1,c,n;
  cin>>n;
  int k=1;
  while(k<=n)
  {
    c=a+b;
    a=b;
    b=c;
    k++;
  }
  cout<<c;
}