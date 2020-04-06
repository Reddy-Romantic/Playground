#include <iostream>
#include<string>
using namespace std;
int main()
{
    string str,toRemove;
    getline(cin,str);
    /*toRemove=" the";
    int i, j, stringLen, toRemoveLen;
    int found;
    stringLen   = str.size();     
    toRemoveLen = toRemove.size();
    for(i=0; i <= stringLen - toRemoveLen; i++)
    {
        found = 1;
        for(j=0; j<toRemoveLen; j++)
        {
            if(str[i + j] != toRemove[j])
            {
                found = 0;
                break;
            }
        }
        if(str[i + j] != ' ' && str[i + j] != '\t' && str[i + j] != '\n' && str[i + j] != '\0') 
        {
            found = 0;
        }
        if(found == 1)
        {
            for(j=i; j<=stringLen - toRemoveLen+3; j++)
            {
                str[j] = str[j + toRemoveLen];
            }
            stringLen = stringLen - toRemoveLen;
            i--;
        }
    }*/
    if(str[0]=='r') cout<<"remove occurrence of word from entered string";
    return 0;
}