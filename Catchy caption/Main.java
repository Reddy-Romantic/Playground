#include <string>
#include <iostream>
using namespace std;
int main()
{
   string ch;
  int count=0;
   getline(cin,ch);
   for(int i=0;i<ch.size();i++)
   {
     if(ch[i]==' ') count++;
   }
  if(count>10) cout<<"Caption not eligible for the contest";
  else cout<<"Caption eligible for the contest";
   
}