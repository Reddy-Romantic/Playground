#include<iostream>
using namespace std;
int main()
{
  int n,a[100][100],sum=0,sum2=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    sum+=a[i][i];
    sum2+=a[i][n-i-1];
  }
  if(sum!=sum2) 
  {cout<<"No";
   return 0;
  }
  for (int i = 0; i < n; i++) { 
          
        int rowSum = 0;      
        for (int j = 0; j < n; j++) 
            rowSum += a[i][j]; 
          
        // check if every row sum is 
        // equal to prime diagonal sum 
        if (rowSum != sum) 
        {
          cout<<"No";
          return 0;
        }
    } 
  
    // For sums of Columns 
    for (int i = 0; i < n; i++) { 
          
        int colSum = 0;      
        for (int j = 0; j < n; j++) 
            colSum += a[j][i]; 
  
        // check if every column sum is  
        // equal to pme diagonal sum 
        if (colSum != sum) 
        {
          cout<<"No";
          return 0;
        } 
    } 
  cout<<"Yes";

}