#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,x;
  cin>>n>>x;
  int lastpatient=(n-1)*x;
  int doctime=(n-1)*20;
  cout<<doctime-lastpatient;
  return 0;
}