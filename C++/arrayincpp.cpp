#include<iostream>
using namespace std;
int main(){
	int n, i, size;
	cout<<"Enter number to make the size of array: ";
	cin>>n;
	float percantage[n];
	size = sizeof(percantage)/sizeof (percantage[n]);
	for(i=1; i<=size; ++i){
		cout<<"Enter number: ";
		cin>>percantage[i];
	}
	for(i=1; i<=size; ++i){
		cout<<"Number is: "<<percantage[i]<<endl;
	}
}
