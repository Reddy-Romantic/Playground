#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  while(scanf("%d",&b)==1)
  {
     a=a-(b%2)-(b/2);
  }
  if(a>=0){
  printf("YES");}
  else{
  printf("NO");
  }
  return 0;
}