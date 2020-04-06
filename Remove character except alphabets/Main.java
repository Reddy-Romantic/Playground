#include <iostream>
#include<string>
using namespace std;
int main() {
    string line;
    getline(cin, line);
    for(int i = 0; i < line.size(); i++)
    {
        if (!((line[i] >= 'a' && line[i]<='z') || (line[i] >= 'A' && line[i]<='Z')))
        {
            continue;
        }
      else cout<<line[i];
    }   
    return 0;
}