#include<iostream>
using namespace std;
unsigned int root(unsigned int x)
{
  if(x<10) return x;
  x=x%10+root(x/10);
  return root(x);
}
int main()
{
  int x;
  cin>>x;
  cout<<root(x);
}