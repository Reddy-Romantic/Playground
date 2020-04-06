#include<iostream>
using namespace std;
int main()
{
  int n,k=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(j!=i) cout<<i<<"*";
      else cout<<i;
    }
    cout<<endl;
  }
  int s=n;
  for(int i=n;i>=1;i--)
  {
    for(int j=i;j>=1;j--)
    {
      if(j!=1) cout<<s<<"*";
      else cout<<s;
    }
    s--;
    cout<<endl;
  }
}