#include<iostream>
int main()
{
  int a,s=0;
  std::cin>>a;
  do{
    a=a/10;
    s+=1;
}while(a>0);
  std::cout<<s;}