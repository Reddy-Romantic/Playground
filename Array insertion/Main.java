#include<iostream>
using namespace std;
int main()
{
	int arr[50], size, insert, i, pos;
	cout<<"Enter the number of elements in the array\n";
	cin>>size;
	cout<<"Enter the elements in the array\n";
	for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
	
	cout<<"Enter the location where you wish to insert an element\n";
	cin>>pos;
  if(pos>size) 
  {cout<<"Invalid Input";
   return 0;
  }
    cout<<"Enter the value to insert\n";
	cin>>insert;
	// now create a space at the required position
	for(i=size; i>=pos; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[pos-1]=insert;
	cout<<"Array after insertion is\n";
	for(i=0; i<size+1; i++)
	{
		cout<<arr[i]<<endl;
	}
}