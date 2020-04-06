#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{   
  int rev=0,d,a=n,f,g=n,count=0;
  while(n>0)
  {
    count++;
    n=n/10;
  }
  n=a;
  while(n>0)
    { d=n%10;
     f=power(d,count);
      rev=rev+f;
      n=n/10;
    }
 if(rev==a) return 1;
 else return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}