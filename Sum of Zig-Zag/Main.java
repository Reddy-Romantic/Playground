#include<iostream>
using namespace std;
int main()
{
int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
cin >> m >> n;
int i, j;
int mat[m][n];
for(i = 0; i < m; i++)
{
       for(j = 0; j < n; j++)
       {
         cin >> mat[i][j];
       }
}

      for(j = 0; j < n; j++)
       {
        row1 = row1 + mat[0][j];
      }
  row1=row1-mat[0][n-1];

 for(i = 0; i < n; i++)
  {
         col_n = col_n + mat[m-1][i];
  }
  col_n=col_n-mat[m-1][0];

for(i = 0; i < m; i++)
{
     for(j = 0; j < n; j++)
    {
      if((i+j)==(m-1))
       {
        diag += mat[i][j];
       }
      else if(j == 0 && i == m-1)
      {
        col_n -=mat[i][j];
      }
    }
}
cout <<"Sum of Zig-Zag pattern is " << diag+row1+col_n;
  return 0;
}