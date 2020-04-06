#include<iostream>
using namespace std;
int main()
{
   int n,f=0;
  cin>>n;
  int a[n],x;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>x;
  for(int i=0;i<n;i++)
  {
    if(a[i]==x) f=1;
  }
  if(f==1) cout<<"She passed her exam";
  else cout<<"She failed";
}