#include<iostream>
using namespace std;
int main(){
	int n, i, k, j;
	cout<<"Enter value of n: ";
	cin>>n;
	for(i=1; i<=n; ++i){
		for(k=1; k<=(n-i); ++k){
			cout<<" ";
		}
			for(j=1; j<=(i*2-1); ++j){
				cout<<"*";
			}
			cout<<endl;
	}
	
}
