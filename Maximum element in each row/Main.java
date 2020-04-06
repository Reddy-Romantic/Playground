#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    int max=a[i][0];
    for(int j=1;j<c;j++)
    {
      if(a[i][j]>max) max=a[i][j];
    }
    cout<<max<<endl;
  }
}