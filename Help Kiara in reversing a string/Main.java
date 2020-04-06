#include <iostream>
#include<cstring>
#include<algorithm>
using namespace std;
void reverse(string str) 
{ 
   for (int i=str.length()-1; i>=0; i--) 
      cout << str[i];  
} 
  
// Driver code 
int main(void) 
{ 
    char s[100];std::cin.getline(s,100); 
    reverse(s); 
    return (0); 
} 