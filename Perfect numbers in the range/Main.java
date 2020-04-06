# include <iostream>
# include <string>
using namespace std;
int main()
{
    int i=1,a, u=1, sum=0,ctr=0;
 cin>>i>>a;
   while(i<=a)
 {                                 
   while(u<=a)
   {                              
     if(u<i)
     {
      if(i%u==0 )
      sum=sum+u;
     }                         
     u++;
   }                           
   if(sum==i)
   {
       ctr++;
    cout<<i<<" ";
   }
   i++;
   u=1;  sum=0;
 } 
     
}