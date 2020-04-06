#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  float r,k,z;
  cin>>a>>b>>c>>d;
  cout<<a/6<<"\n";
  r=((d/6)+0.1*(d%6));
  cout<<r<<"\n";
  k=c/r;
  cout<<fixed<<setprecision(1)<<k<<"\n";
  z=(float)b/50;
  cout<<z;
  if(k>z)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
}