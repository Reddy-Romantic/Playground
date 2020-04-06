#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0,a;
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a;
      if(a>max) max=a;
    }
  }
  cout<<"The maximum element is "<<max;
}