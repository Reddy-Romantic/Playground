#include<iostream>
using namespace std;
int main()
{
  int n,a,sum=0;
  cin>>n;
  a=n;
  while(n>0)
  {
    sum+=n%10;
    n=n/10;
  }
  if(a%sum==0) cout<<"Harshad Number";
  else cout<<"Not Harshad Number";
}