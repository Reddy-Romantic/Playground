#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum,fnum1;
	cin>>fnum;
   int found;
    found=fnum.find(".");
   //fnum.erase(fnum.begin(),found);
    //fnum1.assign(fnum,found,fnum.end()-1);
  if (found == string::npos) 
        cout<<"Floating part is : "<<"";
  else
    cout<<"Floating part is : "<<fnum.substr(found+1);
  
}