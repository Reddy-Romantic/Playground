#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int m,n,req,a;
  cin>>m>>n>>req;
  a=pow(m,n);
  if(a>=req) cout<<"Doctor, you can proceed with your experiment.";
  else cout<<"Sorry Doctor! You need more bacteria.";
  
}