#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0,a;
  cin>>n;
  while(n>0)
  {
    a=n%10;
    if(a%2==0) even+=a;
    else odd+=a;
    n=n/10;
  }
  if(even==odd) cout<<"Yes";
  else cout<<"No";

}