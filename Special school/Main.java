#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int k=0,f;
  for(int i=s1.size()-1;i>=0;i--)
  {
    if(s1[i]!=s2[k])
    {
      f=0;
      break;
    }
    else
    {
      f=1;
      k++;
    }
  }
  if(f==1) cout<<"It is correct";
  else cout<<"It is wrong";
}