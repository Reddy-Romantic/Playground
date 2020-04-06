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
  int max;
  for(int i=0;i<c;i++)
  {
    max=a[0][i];
    for(int j=0;j<r;j++)
    {
      if(a[j][i]>max) max=a[j][i];
    }
    cout<<max<<endl;
  }
  return 0;
}