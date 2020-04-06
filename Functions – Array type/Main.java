#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0,a;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a;
    if(a%2==0) even++;
    else odd++;
  }
  if(even==n) cout<<"The array is Even";
  else if(odd==n) cout<<"The array is Odd";
  else cout<<"The array is Mixed";
}