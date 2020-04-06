#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0,a;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a;
    if(a%2==0) even+=a;
    else odd+=a;
  }
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
  
}