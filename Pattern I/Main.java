#include<iostream>
using namespace std;
int main()
{
    int n,i,j,k,s;
    cin>>n;
    s=n;
    for(i=1;i<=4;i++)
    {
        for(k=1;k<=i;k++)
        {
            cout<<s;
        }
        s++;
        cout<<"\n";
    }
    s--;
    for(i=4;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            cout<<s;
        }
        s--;
        cout<<"\n";
    }
    return 0;
}