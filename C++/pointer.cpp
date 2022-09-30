#include<iostream>
using namespace std;
int main(){
	int i, n;
	cout<<"Enter number of blocks: ";
	cin>>n;
	int *p = (int*)calloc(n,sizeof(int));
	for(i=0; i<n; ++i){
		cout<<"Enter number: ";
		cin>>(p+i);
	}
	cout<<"========Retriving numbers========"<<endl;
	for(i=0; i<n; ++i){
		cout<<*(p+i);
	}
}
