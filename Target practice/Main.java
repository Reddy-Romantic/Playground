#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,count=0,a;
  cin>>n;
  while(1)
  {
    cin>>a;
    sum=sum+a;
    count++;
    if(sum>=n)
    {
      cout<<"The number of turns is "<<count;
      break;
    }
  }
}