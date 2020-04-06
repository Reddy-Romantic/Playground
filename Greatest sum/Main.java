#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],row[10],col[10];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  int k=0;
  for(int i=0;i<r;i++)
  {
    row[k]=0;
    for(int j=0;j<c;j++)
    {
      row[k]+=a[i][j];
    }
    cout<<row[k]<<" ";
    k++;
  }
  cout<<endl;
  int max=0,index;
  for(int i=0;i<k;i++)
  {
    if(row[i]>max) 
    {
      max=row[i];index=i;
    }
  }
  cout<<"Row "<<index+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  int m=0;
  for(int i=0;i<r;i++)
  {
    col[m]=0;
    for(int j=0;j<c;j++)
    {
      col[m]+=a[j][i];
    }
    cout<<col[m]<<" ";
    m++;
  }
  cout<<endl;
  int ma=0,ind;
  for(int i=0;i<m;i++)
  {
    if(col[i]>ma) 
    {ma=col[i];ind=i;
    }
  }
  cout<<"Column "<<ind+1<<" has maximum sum"<<endl;
}