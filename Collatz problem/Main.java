#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  while(n!=1)
  {
    if(n%2==0)
    {
      cout<<n<<endl;
      n=n/2;
    }
    else
    {
      cout<<n<<endl;
      n=3*n+1;
    }
    count++;
  }
  cout<<"1\n"<<count;
}