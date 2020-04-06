#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,m,f;
  cin>>n;
  int *p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
    if((*(p+i))%2==0) f++;
    else m++;
  }
  cout<<m<<endl;
  cout<<f;
  
  return 0;
}