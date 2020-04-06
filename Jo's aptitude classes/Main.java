#include <iostream>
using namespace std;
int main()
{
    int n1, n2,n3,n;
    cin >> n1 >> n2>>n3>>n;
    while(n1 != n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
  while(n1!=n3)
  {
    if(n1>n3)
         n1-=n3;
    else
        n3-=n1;
  }
  if(n1==n) cout<<"Answer is correct.";
  else cout<<"Answer is wrong.";
    return 0;
}